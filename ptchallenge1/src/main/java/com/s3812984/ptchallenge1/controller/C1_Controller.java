package com.s3812984.ptchallenge1.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.s3812984.ptchallenge1.model.Item;
import com.s3812984.ptchallenge1.model.ItemList;

import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class C1_Controller {
    protected ItemList itemList;

    protected C1_Controller() {
    }

    @PostMapping("/item")
    public void createItem(int itemID, String itemTitle, String itemDesc, String imagePath, double itemPrice) {
        itemList.addItemToList(itemID, itemTitle, itemDesc, imagePath, itemPrice);
    }

    @GetMapping("item/item{id}")
    public Item getItem(@PathVariable int ID) {
        return itemList.getItem(ID);
    }

    @GetMapping("/item/item")
    public ArrayList<Item> itemList() {
        return itemList.getItemList();        
    }
    
    @PutMapping("/item/item{id}")
    public Item updateItem(@PathVariable int ID, @RequestBody String itemDesc, @RequestBody double itemPrice) {
        
        return currItem;
    }

    @DeleteMapping("/item/item{id}")
    public void deleteItem(@PathVariable int ID){

    }
}
