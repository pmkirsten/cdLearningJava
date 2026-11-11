package com.campusdual.interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightBooking implements IBooking{
    private String company;
    private String flightNumber;
    private String bookedSeat = "";
    private Date bookDate;

    public FlightBooking(String company, String flightNumber) {
        this.company = company;
        this.flightNumber = flightNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(String bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public void book(Date bookDate, String... args) {
        if (this.getBookedSeat().isEmpty() && args.length > 0 ){
            this.bookedSeat = args[0];
            this.bookDate = bookDate;
            System.out.println("Booked seat on " + this.getCompany() + " " + this.getFlightNumber());
        } else {
            System.out.println("Cannot perform a flight reservation");
        }
    }

    @Override
    public void cancelBook() {
        this.setBookedSeat("");
        System.out.println("Booked succesfully cancelled");

    }

    @Override
    public void getTicketDetail() {
        if (!this.getBookedSeat().isEmpty()){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
            System.out.println("Flight " + this.getFlightNumber() + " ("+ this.getCompany() +"), for date " + sdf.format(this.getBookDate()) + " has a seat booked: " + this.getBookedSeat());
        } else {
            System.out.println("The flight is not booked");
        }
    }
}
