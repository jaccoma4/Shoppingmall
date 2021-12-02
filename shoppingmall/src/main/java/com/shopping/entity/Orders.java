package com.shopping.entity;

import java.time.LocalDateTime;

public class Orders {
	private int id;
	private int userNumber;
	private int serialNumber;
	private LocalDateTime orderDate;
	private String depositChecked;
	private String address;
	public Orders(int id, int userNumber, int serialNumber, LocalDateTime orderDate, String depositChecked,
			String address) {
		super();
		this.id = id;
		this.userNumber = userNumber;
		this.serialNumber = serialNumber;
		this.orderDate = orderDate;
		this.depositChecked = depositChecked;
		this.address = address;
	}
	public Orders() {
		super();
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
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public String getDepositChecked() {
		return depositChecked;
	}
	public void setDepositChecked(String depositChecked) {
		this.depositChecked = depositChecked;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", userNumber=" + userNumber + ", serialNumber=" + serialNumber + ", orderDate="
				+ orderDate + ", depositChecked=" + depositChecked + ", address=" + address + "]";
	}
	
	
}
