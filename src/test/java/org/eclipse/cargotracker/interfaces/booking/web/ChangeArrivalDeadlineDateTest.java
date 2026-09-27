package org.eclipse.cargotracker.interfaces.booking.web;

import org.eclipse.cargotracker.interfaces.booking.facade.BookingServiceFacade;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.Test;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ChangeArrivalDeadlineDateTest {

    private static final String TRACKING_ID = "DEF789";

    @Test
    public void loadRequestsTheCorrectTrackingId() throws Exception {
        RecordingBookingServiceFacade facade = new RecordingBookingServiceFacade();
        facade.cargoToReturn = validCargoRoute("03/15/2014 12:00 PM CET");
        ChangeArrivalDeadlineDate bean = newBean(facade);
        bean.setTrackingId(TRACKING_ID);

        bean.load();

        assertEquals(TRACKING_ID, facade.requestedTrackingId);
        assertEquals(1, facade.loadCalls);
    }

    @Test
    public void loadConvertsFormattedDeadlineIntoEditableDate() throws Exception {
        RecordingBookingServiceFacade facade = new RecordingBookingServiceFacade();
        facade.cargoToReturn = cargoRouteWithDateOnlyDeadline("03/15/2014");
        ChangeArrivalDeadlineDate bean = newBean(facade);
        bean.setTrackingId(TRACKING_ID);

        bean.load();

        assertEquals("03/15/2014",
                new SimpleDateFormat("MM/dd/yyyy").format(bean.getArrivalDeadlineDate()));
        assertSame(facade.cargoToReturn, bean.getCargo());
    }

    @Test
    public void malformedDeadlineIsSurfacedRatherThanConvertedToNull() throws Exception {
        RecordingBookingServiceFacade facade = new RecordingBookingServiceFacade();
        facade.cargoToReturn = cargoRouteWithDateOnlyDeadline("not-a-date");
        ChangeArrivalDeadlineDate bean = newBean(facade);
        bean.setTrackingId(TRACKING_ID);

        try {
            bean.load();
            fail("Expected malformed deadline to be surfaced instead of silently converted");
        } catch (RuntimeException expected) {
            assertTrue(expected.getCause() instanceof java.text.ParseException);
        }
        assertNull(bean.getArrivalDeadlineDate());
    }

    @Test
    public void changeArrivalDeadlineDelegatesSelectedDateAndTrackingId() throws Exception {
        RecordingBookingServiceFacade facade = new RecordingBookingServiceFacade();
        ChangeArrivalDeadlineDate bean = newBean(facade);
        bean.setTrackingId(TRACKING_ID);
        Date selected = new SimpleDateFormat("MM/dd/yyyy").parse("04/20/2014");
        bean.setArrivalDeadlineDate(selected);

        try {
            bean.changeArrivalDeadline();
        } catch (NullPointerException expected) {
            // PrimeFaces.current().dialog().closeDynamic(...) requires a live
            // JSF request; none is available in this container-free test.
            // The facade delegation below already happened by this point.
        }

        assertEquals(TRACKING_ID, facade.changeDeadlineTrackingId);
        assertSame(selected, facade.changeDeadlineDate);
        assertEquals(1, facade.changeDeadlineCalls);
    }

    @Test
    public void nullSelectedDateIsRejected() throws Exception {
        RecordingBookingServiceFacade facade = new RecordingBookingServiceFacade();
        ChangeArrivalDeadlineDate bean = newBean(facade);
        bean.setTrackingId(TRACKING_ID);
        bean.setArrivalDeadlineDate(null);

        bean.changeArrivalDeadline();

        assertEquals(0, facade.changeDeadlineCalls);
    }

    @Test
    public void updateDoesNotReportSuccessWhenDelegationFails() throws Exception {
        RecordingBookingServiceFacade facade = new RecordingBookingServiceFacade();
        facade.failChangeDeadline = true;
        ChangeArrivalDeadlineDate bean = newBean(facade);
        bean.setTrackingId(TRACKING_ID);
        bean.setArrivalDeadlineDate(new Date());

        try {
            bean.changeArrivalDeadline();
            fail("Expected the facade failure to propagate rather than be swallowed");
        } catch (IllegalStateException expected) {
            // Delegation failure must remain observable and the dialog must
            // not be closed as if the update succeeded.
        }
    }

    private CargoRoute validCargoRoute(String formattedDeadline) throws Exception {
        Date deadline = new SimpleDateFormat("MM/dd/yyyy hh:mm a z").parse(formattedDeadline);
        return new CargoRoute(TRACKING_ID, "USNYC", "DEHAM", deadline, false, false, "USNYC", "NOT_RECEIVED");
    }

    /**
     * Returns a {@link CargoRoute} whose {@code getArrivalDeadlineDate()}
     * returns exactly {@code dateOnlyValue}, while {@code getArrivalDeadline()}
     * returns an unrelated formatted value. This proves {@code load()} parses
     * the date-only getter specifically, not the full formatted deadline.
     */
    private CargoRoute cargoRouteWithDateOnlyDeadline(final String dateOnlyValue) throws Exception {
        Date unrelatedDeadline = new SimpleDateFormat("MM/dd/yyyy hh:mm a z").parse("01/01/2000 12:00 AM CET");
        return new CargoRoute(TRACKING_ID, "USNYC", "DEHAM", unrelatedDeadline,
                false, false, "USNYC", "NOT_RECEIVED") {
            private static final long serialVersionUID = 1L;

            @Override
            public String getArrivalDeadlineDate() {
                return dateOnlyValue;
            }
        };
    }

    private ChangeArrivalDeadlineDate newBean(BookingServiceFacade facade) throws Exception {
        ChangeArrivalDeadlineDate bean = new ChangeArrivalDeadlineDate();
        Field field = ChangeArrivalDeadlineDate.class.getDeclaredField("bookingServiceFacade");
        field.setAccessible(true);
        field.set(bean, facade);
        return bean;
    }

    private static class RecordingBookingServiceFacade implements BookingServiceFacade {

        private String requestedTrackingId;
        private int loadCalls;
        private CargoRoute cargoToReturn;

        private String changeDeadlineTrackingId;
        private Date changeDeadlineDate;
        private int changeDeadlineCalls;
        private boolean failChangeDeadline;

        @Override
        public String bookNewCargo(String origin, String destination, Date arrivalDeadline) {
            throw new AssertionError("Unexpected booking");
        }

        @Override
        public CargoRoute loadCargoForRouting(String trackingId) {
            requestedTrackingId = trackingId;
            loadCalls++;
            return cargoToReturn;
        }

        @Override
        public void assignCargoToRoute(String trackingId, RouteCandidate route) {
            throw new AssertionError("Unexpected route assignment");
        }

        @Override
        public void changeDestination(String trackingId, String destinationUnLocode) {
            throw new AssertionError("Unexpected destination change");
        }

        @Override
        public void changeDeadline(String trackingId, Date arrivalDeadline) {
            changeDeadlineTrackingId = trackingId;
            changeDeadlineDate = arrivalDeadline;
            changeDeadlineCalls++;
            if (failChangeDeadline) {
                throw new IllegalStateException("Simulated facade failure");
            }
        }

        @Override
        public List<RouteCandidate> requestPossibleRoutesForCargo(String trackingId) {
            throw new AssertionError("Unexpected route request");
        }

        @Override
        public List<Location> listShippingLocations() {
            throw new AssertionError("Unexpected location listing");
        }

        @Override
        public List<CargoRoute> listAllCargos() {
            throw new AssertionError("Unexpected cargo listing");
        }
    }
}
