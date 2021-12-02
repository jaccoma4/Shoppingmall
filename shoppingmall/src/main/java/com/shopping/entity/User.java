package com.shopping.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int id;
	private String userId;
	private String password;
	private String nickname;
	private String name;
	private String address;
	private LocalDate birthDate;
	private int point;
	public User(int id, String userId, String password, String nickname, String name, String address,
			LocalDate birthDate, int point) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.nickname = nickname;
		this.name = name;
		this.address = address;
		this.birthDate = birthDate;
		this.point = point;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", password=" + password + ", nickname=" + nickname + ", name="
				+ name + ", address=" + address + ", birthDate=" + birthDate + ", point=" + point + "]";
	}
	
	
	
	
}
