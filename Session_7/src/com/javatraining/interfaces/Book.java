/**
 * 
 */
package com.javatraining.interfaces;

/**
 * @author kiran
 *
 */
public class Book {
	
	private String bookName;
	private String bookAuthor;
	private String bookIsbn;
	
	
	public Book(String bookName, String bookAuthor, String bookIsbn) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookIsbn = bookIsbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	
	

}
