package com.s3812984.ptchallenge1.dao;

import java.util.ArrayList;

import com.s3812984.ptchallenge1.model.Item;

public class ItemDaoImpl implements ItemDao {

    Item currItem;
    ArrayList<Item> itemList;
    Database db;

    public void getDatabase() {
        itemList = db.getDatabase();
    }

    public Item getItem(int ID) {
        for (Item o : itemList) {
            if (o.getID() == ID) {
                currItem = o;
                return currItem;
            }
        }
        return null;
    }

    public Item createItem(int ID, String itemTitle, String itemDesc, String itemImage, double itemPrice) {
        Item newItem = new Item();
        newItem.setID(ID);
        newItem.setName(itemTitle);
        newItem.setDesc(itemDesc);
        newItem.setImage(itemImage);
        newItem.setPrice(itemPrice);

        return newItem;
    }

    public Item updateItem(int ID, String itemTitle, String itemDesc, double itemPrice) {
        Item currItem = getItem(ID);
        currItem.setDesc(itemDesc);
        currItem.setPrice(itemPrice);
        return currItem;
    }

    public Item deleteItem(int ID) {
        return null;
    }
    
}
