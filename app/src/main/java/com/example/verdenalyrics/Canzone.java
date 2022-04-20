package com.example.verdenalyrics;

public class Canzone {
    String titles;
    String testo;

    public Canzone(String titles, String testo) {
        this.titles = titles;
        this.testo = testo;
    }

    public Canzone(String titles) {
        this.titles = titles;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }
}
