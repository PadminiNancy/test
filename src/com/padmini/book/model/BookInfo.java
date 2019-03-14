package com.padmini.book.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*@Entity
@Table(name = "bookInfo")*/
public class BookInfo {
	/*
	@Id
    @GeneratedValue
	
    @Column(name = "book_id")	*/
	private int book_id;
	
	//@Column(name = "book_name")
	private String book_name;
	
	//@Column(name = "author")
	private String author;
	
	//@Column(name = "price")
	private int price;
	
	//@OneToMany(mappedBy = "bookstatus", cascade = CascadeType.ALL)
    private Set<StatusInfo> bookInfo = new HashSet(0);

	public BookInfo() {
		super();
	}

	public BookInfo(String book_name, String author, int price) {
		super();
		this.book_name = book_name;
		this.author = author;
		this.price = price;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
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

	public Set<StatusInfo> getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(Set<StatusInfo> bookStatus) {
		this.bookInfo = bookStatus;
	}
	
	

}
