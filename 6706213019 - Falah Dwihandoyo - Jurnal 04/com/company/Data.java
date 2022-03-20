package com.company;

public class Data {
    private String judul;
    private String penyanyi;

    public Data (String judul, String penyanyi){
        this.judul = judul;
        this.penyanyi = penyanyi;
    }

    public String getJudul() {
        return this.judul;

    }

    @Override
    public String toString() {
        return this.judul;
    }
}
