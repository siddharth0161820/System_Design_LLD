package com.lld.bookmyshow.model;

public class Movie {
    private String title;
    private String language;

    public Movie(String title, String language) {
        this.title = title;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }
}
