/**
 * 
 */
package com.javatraining.interfaces;

import java.util.Arrays;

/**
 * @author kiran
 *
 */
public class InterfaceExample {

	public static void main(String[] args) {
		EducationalInstitutions educationalInst = new EducationalInstitutions();
		Book b = educationalInst.getBookByIsbn("1234");
		System.out.println(b.getBookName());
		System.out.println(educationalInst.getBookByIsbn("1234").getBookName());
		System.out.println(educationalInst.getBooksByAutor("Orelliy").getBookName());
		System.out.println(educationalInst.getBooksByName("Java").getBookName());

		checkoutBook(educationalInst, "1234","111");

		Countys countys = new Countys();
		System.out.println(countys.getBookByIsbn("1234").getBookName());
		System.out.println(countys.getBooksByAutor("ABC").getBookName());
		System.out.println(countys.getBooksByName("Novel1").getBookName());

		checkoutBook(countys, "1234","222");
		checkoutBook(countys, "1234","999");
	}

	public static boolean checkoutBook(Library library, String isbn, String id) {
		String[] idArr = new String[]{"111","222","333","444"};
		if(Arrays.asList(idArr).contains(id)) {
			library.checkout(isbn);
			return true;
		}
		System.out.println("Unable to validate the id provided, please check and try again");
		return false;
		

	}

	

}
