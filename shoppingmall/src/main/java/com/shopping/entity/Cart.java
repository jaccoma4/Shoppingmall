package com.shopping.entity;

public class Cart {
	private int id;
	private int userNumber;
	private int serialNumber;
	public Cart(int id, int userNumber, int serialNumber) {
		super();
		this.id = id;
		this.userNumber = userNumber;
		this.serialNumber = serialNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Cart() {
		super();
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", userNumber=" + userNumber + ", serialNumber=" + serialNumber + "]";
	}
	
	
}
