package com.lld.bookmyshow.model;

import java.util.Date;
import java.util.List;

public class Booking {
    private User user;
    private Show show;
    private List<Seat> seats;
    private Date bookingTime;
}
