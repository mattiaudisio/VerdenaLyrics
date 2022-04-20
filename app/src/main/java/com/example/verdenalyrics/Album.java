package com.example.verdenalyrics;

public class Album {
    private String Album,Data,Tipo;
    private Integer albumPhoto;

    public Album(String album, String data, String tipo,Integer albumPhoto) {
        Album = album;
        Data = data;
        Tipo = tipo;
        this.albumPhoto = albumPhoto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public Integer getAlbumPhoto() {
        return albumPhoto;
    }

    public void setAlbumPhoto(Integer albumPhoto) {
        this.albumPhoto = albumPhoto;
    }
}
