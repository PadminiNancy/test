package com.padmini.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/*@Entity
@Table(name = "status")*/
public class StatusInfo {
	
		
	/*@Id
    @GeneratedValue
	
    @Column(name = "status_id")*/
	private int status_id;
	
	
//	@Column(name = "status")
	private String status;
	
	
	//@ManyToOne
 //   @JoinColumn(name = "book_id")
	private BookInfo bookInfo;

//	@ManyToOne(fetch = FetchType.LAZY)
 //   @JoinColumn(name = "uname")
	private UserInfo user;
	
	
	
	public BookInfo getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(BookInfo bookstatus) {
		this.bookInfo = bookstatus;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo username) {
		this.user = username;
	}

	public StatusInfo() {
		super();
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
