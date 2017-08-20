/**
 * 
 */
package com.javatraining.exceptions;

/**
 * @author kiran
 *
 */
public class InputValidationException extends Exception{

	
	public InputValidationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InputValidationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InputValidationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InputValidationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
