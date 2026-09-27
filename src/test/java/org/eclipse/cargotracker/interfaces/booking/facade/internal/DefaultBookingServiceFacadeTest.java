package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import org.eclipse.cargotracker.application.BookingService;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class DefaultBookingServiceFacadeTest {

    @Test
    public void changeDeadlineDelegatesExactlyOnce() throws Exception {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        RecordingBookingService service = new RecordingBookingService();
        Field bookingService = DefaultBookingServiceFacade.class.getDeclaredField("bookingService");
        bookingService.setAccessible(true);
        bookingService.set(facade, service);

        Date deadline = new Date();
        facade.changeDeadline("DEF789", deadline);

        assertEquals(new TrackingId("DEF789"), service.trackingId);
        assertSame(deadline, service.deadline);
        assertEquals(1, service.calls);
    }

    private static class RecordingBookingService implements BookingService {
        private TrackingId trackingId;
        private Date deadline;
        private int calls;

        @Override
        public void changeDeadline(TrackingId trackingId, Date deadline) {
            this.trackingId = trackingId;
            this.deadline = deadline;
            calls++;
        }

        @Override
        public TrackingId bookNewCargo(UnLocode origin, UnLocode destination, Date deadline) {
            throw new AssertionError("Unexpected booking");
        }

        @Override
        public List<Itinerary> requestPossibleRoutesForCargo(TrackingId trackingId) {
            throw new AssertionError("Unexpected route request");
        }

        @Override
        public void assignCargoToRoute(Itinerary itinerary, TrackingId trackingId) {
            throw new AssertionError("Unexpected route assignment");
        }

        @Override
        public void changeDestination(TrackingId trackingId, UnLocode destination) {
            throw new AssertionError("Unexpected destination change");
        }
    }
}
