package com.lld.bookmyshow.model;

public class User {
    private String name;
    private String email;

    public void bookTicket(Show show, Seat seat) {
        // basic simulation
        System.out.println("Booking seat " + seat.getSeatNumber() + " for show " + show.getMovie().getTitle());
    }
}
