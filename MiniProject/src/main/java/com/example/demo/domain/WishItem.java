package com.example.demo.domain;




public class WishItem {

    private String itemid;
    private String description;
    private String price;
    private String itemname;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public WishItem(String itemid) {
        this.itemid = itemid;
    }







    public WishItem(String itemname, String description, String price) {
        this.itemname = itemname;
        this.description = description;
        this.price = price;

    }








    @Override

    public String toString(){

        return "\nNavn på ønske: "+ getItemname() + "\n" +
                "\nBeskrivelse: "+getDescription() + "\n" +
                "\nPris: "+ getPrice()+ " kr.";
    }




}
