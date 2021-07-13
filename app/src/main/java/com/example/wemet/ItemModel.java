package com.example.wemet;

public class ItemModel {
    private int image;
    private String name, usia, kota;

    public ItemModel() {
    }

    public ItemModel(int image, String name, String usia, String kota) {
        this.image = image;
        this.kota=kota;
        this.usia=usia;
        this.name=name;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getUsia() {
        return usia;
    }

    public String getKota() {
        return kota;
    }
}

