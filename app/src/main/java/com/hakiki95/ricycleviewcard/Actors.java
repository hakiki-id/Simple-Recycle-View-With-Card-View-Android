package com.hakiki95.ricycleviewcard;

/**
 * Created by HAKIKI PC on 30/11/2015.
 */
public class Actors {

    int Image;
    String namaproduk, hargaproduk;

    public Actors(int image, String namaproduk, String hargaproduk) {
        Image = image;
        this.namaproduk = namaproduk;
        this.hargaproduk = hargaproduk;
    }

    public int getImage() {
        return Image;
    }

    public String getNamaproduk() {
        return namaproduk;
    }

    public String getHargaproduk() {
        return hargaproduk;
    }
}
