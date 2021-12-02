package com.shopping.entity;

import java.time.LocalDateTime;

public class QnA {
	private int id;
	private int userNumber;
	private String title;
	private String category;
	private String content;
	private LocalDateTime writeDate;
	public QnA(int id, int userNumber, String title, String category, String content, LocalDateTime writeDate) {
		super();
		this.id = id;
		this.userNumber = userNumber;
		this.title = title;
		this.category = category;
		this.content = content;
		this.writeDate = writeDate;
	}
	public QnA() {
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "QnA [id=" + id + ", userNumber=" + userNumber + ", title=" + title + ", category=" + category
				+ ", content=" + content + ", writeDate=" + writeDate + "]";
	}
	
	
	
}
