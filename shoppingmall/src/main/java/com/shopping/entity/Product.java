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
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuarntity() {
		return quarntity;
	}
	public void setQuarntity(int quarntity) {
		this.quarntity = quarntity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", serialNumber=" + serialNumber + ", gender=" + gender + ", productName="
				+ productName + ", quarntity=" + quarntity + ", price=" + price + ", category=" + category + "]";
	}
	
	
	
}
