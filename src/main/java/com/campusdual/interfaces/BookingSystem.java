package com.campusdual.interfaces;

import java.util.Date;

public class BookingSystem {

    static void main() {
        CarBooking cb = new CarBooking("1234BCD");
        FlightBooking fb = new FlightBooking("Iberia", "IBE1234");

        cb.book(new Date());
        cb.getTicketDetail();
        cb.cancelBook();
        cb.getTicketDetail();

        System.out.println("=========================");

        fb.book(new Date(), "V72");
        fb.getTicketDetail();
        fb.cancelBook();
        fb.getTicketDetail();

    }
}
