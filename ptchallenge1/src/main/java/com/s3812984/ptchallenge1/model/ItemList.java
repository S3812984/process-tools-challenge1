package com.s3812984.ptchallenge1.model;

import java.util.ArrayList;

import com.s3812984.ptchallenge1.dao.ItemDao;
import com.s3812984.ptchallenge1.dao.ItemDaoImpl;

public class ItemList {
    private ItemDao itemDao;
    private ArrayList<Item> itemList;

    public ItemList() {
        itemDao = new ItemDaoImpl();
    }

    public ArrayList<Item> getItemList() { return this.itemList; }
    
    public void updateItemList(ArrayList<Item> itemList) { this.itemList = itemList; }

    public void addItemToList(int itemID, String itemTitle, String itemDesc, String imagePath, double itemPrice) { 
        Item item = itemDao.createItem(itemID, itemTitle, itemDesc, imagePath, itemPrice);
        itemList.add(item);
        updateItemList(itemList);
    }

    public Item getItem(int itemID) {
        return itemDao.getItem(itemID);
    }
    public Item updateItem(int itemID, String itemTitle, String itemDesc, double itemPrice) {
        return itemDao.updateItem(itemID, itemTitle, itemDesc, itemPrice);
    }

}
