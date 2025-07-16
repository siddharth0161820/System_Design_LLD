package com.lld.bookmyshow.model;

public class Seat {
    private int seatNumber;
    private String seatType;
    private boolean isAvailable;

    public Seat(int seatNumber, String seatType, boolean isAvailable) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.isAvailable = isAvailable;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
