package com.s3812984.ptchallenge1.model;

public class Item {
    public Item() {
    }

    private int ID;
    private String name, desc, image;
    private double price;

    public Item(int ID, String name, String desc, String image, double price) {
        this.ID = ID;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public Void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return desc;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "item{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }
}
