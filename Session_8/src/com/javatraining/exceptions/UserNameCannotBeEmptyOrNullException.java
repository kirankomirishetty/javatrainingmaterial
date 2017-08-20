/**
 * 
 */
package com.javatraining.exceptions;

/**
 * @author kiran
 *
 */
public class UserNameCannotBeEmptyOrNullException extends InputValidationException {



	/**
	 * @param message
	 */
	public UserNameCannotBeEmptyOrNullException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public UserNameCannotBeEmptyOrNullException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UserNameCannotBeEmptyOrNullException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public UserNameCannotBeEmptyOrNullException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
