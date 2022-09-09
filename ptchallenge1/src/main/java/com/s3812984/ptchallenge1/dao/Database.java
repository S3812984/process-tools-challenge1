package com.s3812984.ptchallenge1.dao;

import java.util.ArrayList;

import com.s3812984.ptchallenge1.model.Item;

public class Database {
    ArrayList<Item> baseItemList = new ArrayList<Item>();
    
    public Database() {
        baseItemList.add(new Item(0, "Item1", "Desc of Item1", "", 1.0));
        baseItemList.add(new Item(1, "Item2", "Desc of Item2", "", 2.0));
        baseItemList.add(new Item(2, "Item3", "Desc of Item3", "", 3.0));
        baseItemList.add(new Item(3, "Item4", "Desc of Item4", "", 4.0));
        baseItemList.add(new Item(4, "Item5", "Desc of Item5", "", 5.0));
    }

    public ArrayList<Item> getDatabase() {
        return baseItemList;
    }
}
