package com.shopping.entity;

import java.time.LocalDate;

public class Coupon {
	private int id;
	private int userNumber;
	private int sirialNumber;
	private LocalDate regDate;
	private LocalDate ValidityDate;
	private int discount;
	public Coupon(int id, int userNumber, int sirialNumber, LocalDate regDate, LocalDate validityDate, int discount) {
		super();
		this.id = id;
		this.userNumber = userNumber;
		this.sirialNumber = sirialNumber;
		this.regDate = regDate;
		ValidityDate = validityDate;
		this.discount = discount;
	}
	public Coupon() {
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
	public int getSirialNumber() {
		return sirialNumber;
	}
	public void setSirialNumber(int sirialNumber) {
		this.sirialNumber = sirialNumber;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public LocalDate getValidityDate() {
		return ValidityDate;
	}
	public void setValidityDate(LocalDate validityDate) {
		ValidityDate = validityDate;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", userNumber=" + userNumber + ", sirialNumber=" + sirialNumber + ", regDate="
				+ regDate + ", ValidityDate=" + ValidityDate + ", discount=" + discount + "]";
	}
	
	
}
