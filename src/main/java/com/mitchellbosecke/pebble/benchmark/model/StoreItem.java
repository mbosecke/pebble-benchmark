package com.mitchellbosecke.pebble.benchmark.model;

import java.util.ArrayList;
import java.util.List;

public class StoreItem {

	public String brand;
	public String name;
	public long id;
	public double price;
	public int quantity;
	
	public StoreItem(String brand, String name, long id, double price, int quantity) {
		super();
		this.brand = brand;
		this.name = name;
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}
	
	public static List<StoreItem> getItems() {
		List<StoreItem> items = new ArrayList<StoreItem>();
		items.add(new StoreItem("Zurich", "Magazine Rack", 382736, 29.95, 4));
		items.add(new StoreItem("Samsung", "Galaxy Tablet", 918277, 399.99, 15 ));
		items.add(new StoreItem("LG", "60 \" 1080p Plasma TV", 128172, 848.99, 3 ));
		items.add(new StoreItem("Chateau D'Ax", "Genuine Leather Sofa", 12312, 449.99, 1));
		items.add(new StoreItem("Seagate", "1 TB USB 3.0 Expansion", 123131, 59.99, 11 ));
		items.add(new StoreItem("Lexar", "S50 Jump Drive", 1231312, 12.99, 25 ));
		items.add(new StoreItem("Asus", "AMD Quad-Core A10-6700", 123432, 469.99, 2 ));
		items.add(new StoreItem("HP", "All-In-One Computer", 184839, 749.99, 4));
		items.add(new StoreItem("Logitech", "Wireless Mouse", 87439473, 14.99, 6 ));
		items.add(new StoreItem("Apple", "iMac", 48397593, 1249.99, 3 ));
		items.add(new StoreItem("Canon", "EOS 70D 20.2MP DSLR Camera", 43243242, 1399.99, 2));
		return items;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
