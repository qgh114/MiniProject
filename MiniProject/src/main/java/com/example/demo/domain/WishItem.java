package com.example.demo.domain;




public class WishItem {

    private String itemid;
    private String description;
    private String price;

    public WishItem(String itemid) {
        this.itemid = itemid;
    }

    private String itemname;
    private int id;

    public String getItemid() {
        return itemid;
    }


    public WishItem(String itemid, String itemname, String description, String price) {
        this.itemid = itemid;
        this.itemname = itemname;
        this.description = description;
        this.price = price;

    }

    public WishItem(String itemname, String description, String price) {
        this.itemname = itemname;
        this.description = description;
        this.price = price;

    }







    public String getItemname() {
        return itemname;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    @Override

    public String toString(){

        return "\nNavn på ønske: "+ getItemname() + "\n" +
                "\nBeskrivelse: "+getDescription() + "\n" +
                "\nPris: "+ getPrice()+ " kr.";
    }




}
