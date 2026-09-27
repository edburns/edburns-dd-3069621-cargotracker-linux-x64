package org.eclipse.cargotracker.interfaces.booking.web;

import org.eclipse.cargotracker.interfaces.booking.facade.BookingServiceFacade;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Handles changing the cargo arrival deadline date. Operates against a
 * dedicated service facade, and is completely separated from the domain
 * layer, mirroring the existing {@link ChangeDestination} editor.
 */
@Named
@ViewScoped
public class ChangeArrivalDeadlineDate implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String DATE_PATTERN = "MM/dd/yyyy";

    private String trackingId;
    private CargoRoute cargo;
    private Date arrivalDeadlineDate;

    @Inject
    private BookingServiceFacade bookingServiceFacade;

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public CargoRoute getCargo() {
        return cargo;
    }

    public Date getArrivalDeadlineDate() {
        return arrivalDeadlineDate;
    }

    public void setArrivalDeadlineDate(Date arrivalDeadlineDate) {
        this.arrivalDeadlineDate = arrivalDeadlineDate;
    }

    public void load() {
        cargo = bookingServiceFacade.loadCargoForRouting(trackingId);
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
            dateFormat.setLenient(false);
            arrivalDeadlineDate = dateFormat.parse(
                    cargo.getArrivalDeadlineDate());
        } catch (ParseException e) {
            throw new RuntimeException(
                    "Error parsing arrival deadline date", e);
        }
    }

    public void changeArrivalDeadline() {
        if (arrivalDeadlineDate == null) {
            FacesContext context = FacesContext.getCurrentInstance();
            if (context != null) {
                FacesMessage message = new FacesMessage(
                        "Arrival deadline date is required.");
                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                context.addMessage(null, message);
            }
            return;
        }

        bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate);

        PrimeFaces.current().dialog().closeDynamic("DONE");
    }
}
