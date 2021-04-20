package com.example.demo.domain;


import java.util.ArrayList;

public class WishList {
    private ArrayList wishlist;
    private String title;


    public WishList(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public WishList(ArrayList wishlist) {
        this.wishlist = wishlist;
    }


}

