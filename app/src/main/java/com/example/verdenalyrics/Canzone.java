package com.example.verdenalyrics;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Canzone implements Serializable {
    String titles;
    String testo;

    public Canzone(String titles, String testo) {
        this.titles = titles;
        this.testo = testo;
    }


    protected Canzone(Parcel in) {
        titles = in.readString();
        testo = in.readString();
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