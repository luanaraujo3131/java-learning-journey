package Exceptions.HotelBookingSoluntion.Model.Entities;

import Exceptions.HotelBookingSoluntion.Model.Exception.DomainException;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Short roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Short roomNumber, Date checkin, Date checkout) throws DomainException {
        if (!checkout.after(checkin)){
            throw new DomainException("Check-out data must be after check-in data");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Short getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Short roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Long duration(){
        long diff = checkout.getTime() - checkin.getTime();//it takes times in milliseconds
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //converts from milliseconds to days
    }

    public void updatedDates(Date checkin, Date checkout) throws DomainException {
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)){
            throw new DomainException("Reservations dates for updates must be future dates");
        }
        if (!checkout.after(checkin)){
            throw new DomainException("Check-out data must be after check-in data");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber +
                ", checkin: " + simpleDateFormat.format(checkin) +
                ", checkout: " + simpleDateFormat.format(checkout) +
                ", " + duration() + " nights";
    }
}
