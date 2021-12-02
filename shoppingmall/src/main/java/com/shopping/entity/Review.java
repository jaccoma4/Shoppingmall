package com.shopping.entity;

import java.time.LocalDateTime;

public class Review {
	private int id;
	private int userNumber;
	private int serialNumber;
	private LocalDateTime writeDate;
	private int score;
	private String title;
	private String content;
	public Review(int id, int userNumber, int serialNumber, LocalDateTime writeDate, int score, String title,
			String content) {
		super();
		this.id = id;
		this.userNumber = userNumber;
		this.serialNumber = serialNumber;
		this.writeDate = writeDate;
		this.score = score;
		this.title = title;
		this.content = content;
	}
	public Review() {
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
	public LocalDateTime getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", userNumber=" + userNumber + ", serialNumber=" + serialNumber + ", writeDate="
				+ writeDate + ", score=" + score + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
