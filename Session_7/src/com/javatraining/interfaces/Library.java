/**
 * 
 */
package com.javatraining.interfaces;

/**
 * @author kiran
 *
 */
public interface Library {

	Book getBookByIsbn(String isbn);
	
	Book getBooksByAutor(String author);
	
	Book getBooksByName(String name);
	
	void checkout(String isbn);
}
