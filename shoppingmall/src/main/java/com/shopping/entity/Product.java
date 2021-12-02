package com.shopping.entity;

public class Product {
	private int id;
	private int serialNumber;
	private String gender;
	private String productName;
	private int quarntity;
	private int price;
	private String category;
	public Product(int id, int serialNumber, String gender, String productName, int quarntity, int price,
			String category) {
		super();
		this.id = id;
		this.serialNumber = serialNumber;
		this.gender = gender;
		this.productName = productName;
		this.quarntity = quarntity;
		this.price = price;
		this.category = category;
	}
	
	
}
