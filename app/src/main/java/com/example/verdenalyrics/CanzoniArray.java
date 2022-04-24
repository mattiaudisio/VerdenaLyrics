package com.example.verdenalyrics;

import java.io.Serializable;
import java.util.ArrayList;

public class CanzoniArray implements Serializable {
    ArrayList<Canzone> arrayCanzoni;

    public CanzoniArray() {
    }

    public ArrayList<Canzone> getArrayCanzoni() {
        return arrayCanzoni;
    }

    public void setArrayCanzoni(ArrayList<Canzone> arrayCanzoni) {
        this.arrayCanzoni = arrayCanzoni;
    }
}
