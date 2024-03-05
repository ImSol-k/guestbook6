package com.javaex.vo;

public class GuestbookVo {

	private int bookId;
	private String name;
	private String pw;
	private String content;
	private String date;
	
	public GuestbookVo() {
	}
	public GuestbookVo(int bookId, String pw) {
		this.bookId = bookId;
		this.pw = pw;
	}
	public GuestbookVo(int bookId, String name, String pw, String content, String date) {
		this.bookId = bookId;
		this.name = name;
		this.pw = pw;
		this.content = content;
		this.date = date;
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "GuestbookVo [bookId=" + bookId + ", name=" + name + ", pw=" + pw + ", content=" + content + ", date="
				+ date + "]";
	}
	
}
