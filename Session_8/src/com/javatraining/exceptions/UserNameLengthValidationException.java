/**
 * 
 */
package com.javatraining.exceptions;

/**
 * @author kiran
 *
 */
public class UserNameLengthValidationException extends InputValidationException {
	
	private static int MIN_LENGTH = 4;
	private static int MAX_LENGTH = 10;

	public UserNameLengthValidationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message + "minLength "+MIN_LENGTH+" Max Lenght "+MAX_LENGTH, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public UserNameLengthValidationException(String message, Throwable cause) {
		super(message + "minLength "+MIN_LENGTH+" Max Lenght "+MAX_LENGTH, cause);
		// TODO Auto-generated constructor stub
	}
	public UserNameLengthValidationException(String message) {
		super(message+ "minLength "+MIN_LENGTH+" Max Lenght "+MAX_LENGTH);		// TODO Auto-generated constructor stub
	}
	public UserNameLengthValidationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
