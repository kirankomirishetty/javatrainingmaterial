/**
 * 
 */
package com.javatraining.abstraction;

import com.javatraining.interfaces.Book;

/**
 * @author kiran
 *
 */
public class Countys extends AbstractLibrary {

	public Book getBookByIsbn(String isbn) {
		
		return new Book("Novel1", "ABC", "123456");
	}

	public Book getBooksByAutor(String author) {
		return new Book("Novel2", "XYZ", "22222");
	}

	public Book getBooksByName(String name) {
		return new Book("Novel3", "abcxyz", "33333");
	}

	public void checkout(String isbn) {
		System.out.println("Book CheckedOut for county successfully for "+isbn);
	}

}
