/**
 * 
 */
package com.javatraining.exceptions;

/**
 * @author kiran
 *
 */
public class Login {
	
	public String doLoginWithoutException(String userName, String password) {
		
		if("JAVA".equalsIgnoreCase(userName) && "java".equalsIgnoreCase(password)) {
			return "success";
		}
		else {
			return "failure";
		}
		
	}
	
	public String doLoginWithException(String userName, String password) throws Exception {
		
		if("JAVA".equalsIgnoreCase(userName) && "java".equalsIgnoreCase(password)) {
			return "success";
		}
		throw new Exception("Unable to match your user name and password, please check and try again");
		
	}
	
	public boolean validate(String userName) throws InputValidationException {
		return this.validateUser(userName);
	}
	public boolean validateUser(String userName) throws InputValidationException {
		
		if(userName == null) {
			throw new UserNameCannotBeEmptyOrNullException("User Name cannot be null");
		}
		if((userName.length() <= 4 || userName.length() > 10)) {
			throw new UserNameLengthValidationException("Invalid user name!!!");
		}
		
		return true;
	}

}
