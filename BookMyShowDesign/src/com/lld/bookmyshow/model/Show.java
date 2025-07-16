package com.lld.bookmyshow.model;

import java.util.List;
import java.util.Date;

public class Show {
    private Movie movie;
    private Theatre theatre;
    private Date dateTime;
    private List<Seat> seats;

    public Show(Movie movie, Theatre theatre, Date dateTime, List<Seat> seats) {
        this.movie = movie;
        this.theatre = theatre;
        this.dateTime = dateTime;
        this.seats = seats;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
