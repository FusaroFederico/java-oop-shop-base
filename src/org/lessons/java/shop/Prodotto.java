package org.lessons.java.shop;

public class Prodotto {
	
	// instance variables
	int itemCode;
	String itemName;
	String itemDescription;
	float itemPrice;
	int itemIva;
	
	// constructor method
	public Prodotto(int code, String name, String description, float price, int iva) {
		itemCode = code;
		itemName = name;
		itemDescription = description;
		itemPrice = price;
		itemIva = iva;
	}
}
