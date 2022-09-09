package com.s3812984.ptchallenge1.dao;

import com.s3812984.ptchallenge1.model.Item;

public interface ItemDao {
	
	void getDatabase();
	Item getItem(int ID);
	Item createItem(int ID, String itemTitle, String itemDesc, String itemImage, double itemPrice);
	Item updateItem(int ID, String itemTitle, String itemDesc, double itemPrice);
	Item deleteItem(int ID);
}
