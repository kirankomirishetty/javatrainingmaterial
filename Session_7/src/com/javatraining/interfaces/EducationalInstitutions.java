/**
 * 
 */
package com.javatraining.interfaces;

/**
 * @author kiran
 *
 */
public class EducationalInstitutions implements Library {

	public Book getBookByIsbn(String isbn) {
		
		return new Book("Java", "ORelliy", "121212");
	}

	public Book getBooksByAutor(String author) {
		return new Book("Cucumber", "ORelliy", "212121");
	}

	public Book getBooksByName(String name) {
		return new Book("Selenium", "ORelliy", "13131313");
	}

	public void checkout(String isbn) {
		System.out.println("Book checkout out for Educational Institutions "+isbn);
	}

	
}
