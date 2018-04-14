package com.example.lenovog40.androiddev;

/**
 * Created by Lenovo G40 on 4/12/2018.
 */


public class ListMakanan {
    String versionName;
    String versionHarga;
    int image; // drawable reference id

    public ListMakanan (String vName, String vHarga, int image)
    {
        this.versionName = vName;
        this.versionHarga= vHarga;
        this.image = image;
    }

}