package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	// instance variables
	int itemCode;
	String itemName;
	String itemDescription;
	float itemPrice;
	int itemIva;
	
	// constructor method
	public Prodotto(String name, String description, float price, int iva) {
		// new instance for random number
		Random random = new Random();
		// six-digit random number
		int randomCode = 100000 + random.nextInt(900000);
		
		itemCode = randomCode;
		itemName = name;
		itemDescription = description;
		itemPrice = price;
		itemIva = iva;
	}
	
}
