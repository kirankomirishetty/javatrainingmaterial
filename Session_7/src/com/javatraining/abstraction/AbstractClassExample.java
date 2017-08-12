/**
 * 
 */
package com.javatraining.abstraction;

import com.javatraining.interfaces.Book;

/**
 * @author kiran
 *
 */
public class AbstractClassExample {

	public static void main(String[] args) {
		AbstractLibrary educationalInst = new EducationalInstitutions();
		Book b = educationalInst.getBookByIsbn("1234");
		System.out.println(b.getBookName());
		System.out.println(educationalInst.getBookByIsbn("1234").getBookName());
		System.out.println(educationalInst.getBooksByAutor("Orelliy").getBookName());
		System.out.println(educationalInst.getBooksByName("Java").getBookName());

		educationalInst.validateAndCheckoutBook("1234","111");

		AbstractLibrary countys = new Countys();
		System.out.println(countys.getBookByIsbn("1234").getBookName());
		System.out.println(countys.getBooksByAutor("ABC").getBookName());
		System.out.println(countys.getBooksByName("Novel1").getBookName());

		countys.validateAndCheckoutBook("1234","222");
		countys.validateAndCheckoutBook("1234","999");
	}

	

	

}
