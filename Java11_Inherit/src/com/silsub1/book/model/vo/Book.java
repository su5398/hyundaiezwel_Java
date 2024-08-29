package com.silsub1.book.model.vo;

import java.util.Objects;

public class Book {
	private String title; //책제목
	private String author; //저자명
	private int price; //가격
	
	//기본생성자
	public Book() {}

	//매개변수 생성자
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//Getter and Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//Object 클래스의 toString() 메소드 오버라이딩
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	//Object 클래스의  hashCode() 메소드 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(author, price, title);
	}

	//Object 클래스의 equals() 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && price == other.price && Objects.equals(title, other.title);
	}
	
	
}
