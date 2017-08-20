/**
 * 
 */
package com.javatraining.exceptions;

/**
 * @author kiran
 *
 */
public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Login login = new Login();
		System.out.println(login.doLoginWithoutException("Java","java"));
		System.out.println(login.doLoginWithoutException("Java",""));
		
//		try {
//			System.out.println("line befoe login");
//			System.out.println(login.doLoginWithException("java", "java"));
//			System.out.println("Line after login method");
//			System.out.println("Line after login method");
//			System.out.println("Line after login method");
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			System.out.println("Inside the finally of success case");
//		}
//		
//		try {
//			System.out.println("line befoe login");
//			System.out.println(login.doLoginWithException("java", "java1"));
//			System.out.println("Line after login method");
//			System.out.println("Line after login method");
//			System.out.println("Line after login method");
//		} catch (Exception e) {
//			System.out.println("Inside the catch block");
//			e.printStackTrace();
//		} finally {
//			System.out.println("Inside finally block of exception case");
//		}
		
//		try {
//			if(login.validateUser("abc")) {
//				login.doLoginWithException("abc", "java");
//			}
//		}catch(UserNameLengthValidationException unlve) {
//			System.out.println(unlve.getMessage());
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			login.validate("abc");
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(login.validateUser(null)) {
//				login.doLoginWithException("abc", "java");
			}
		}
//		catch(InputValidationException uncbeone) {
//			System.out.println("inside InputValidationException "+uncbeone.getMessage());
//		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
