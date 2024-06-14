package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// create new objects
		Prodotto prod1 = new Prodotto("prod1", "descr1", 49.99, 22);
		Prodotto prod2 = new Prodotto("prod2", "descr2", 9.90, 22);
		// try methods 
		System.out.println(prod1.getItemPrice() + " €");
		System.out.println(prod1.priceIncludingVat() + " €");
		System.out.println(prod1.getFullName());
		System.out.println(prod2.getItemPrice() + " €");
		System.out.println(prod2.priceIncludingVat() + " €");
		System.out.println(prod2.getFullName());

	}

}
