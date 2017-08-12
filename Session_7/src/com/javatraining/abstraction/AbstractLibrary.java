package com.javatraining.abstraction;

import java.util.Arrays;

import com.javatraining.interfaces.Library;

public abstract class AbstractLibrary implements Library {

	public boolean validateAndCheckoutBook(String isbn, String id) {
		String[] idArr = new String[]{"111","222","333","444"};
		if(Arrays.asList(idArr).contains(id)) {
			checkout(isbn);
			return true;
		}
		System.out.println("Unable to validate the id provided, please check and try again");
		return false;
	}
}
