package com.campusdual.interfaces;

import java.util.Date;

public class CarBooking implements IBooking{
    private String licencePlate;
    private boolean booked;
    private Date bookDate;

    public CarBooking(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public void book(Date bookDate, String... args) {
        if (!this.isBooked()){
            this.setBooked(true);
            this.setBookDate(bookDate);
            System.out.println(this.getLicencePlate() + " car booked succesfully");
        } else {
            System.out.println(this.getLicencePlate() + " car is already booked");
        }

    }

    @Override
    public void cancelBook() {
        if (this.isBooked()){
            this.setBooked(false);
            System.out.println("Booking for " + this.getLicencePlate() + " cancelled");
        }else{
            System.out.println(this.getLicencePlate() + " car is not rented");
        }
    }

    @Override
    public void getTicketDetail() {
        if (this.isBooked()){
            System.out.println(this.getLicencePlate() + " car is booked in " + this.getBookDate());
        } else {
            System.out.println(this.getLicencePlate() + " car is not rented");
        }
    }
}
