/**
 * 
 */
package com.javatraining.strings.demo;

/**
 * @author kiran
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello";
		
		System.out.println("The value of the string is "+str);
		
		System.out.println("The value of the modified string is "+(str+" World"));
		
//		str+=" World"; // str = str + " World"
//		
//		System.out.println("The value of the string after modification is "+str);
//		
//		stringBuilder();
		
		String str1 = "Hello";
		
		System.out.println("Comparing two strings "+(str == str1));
		
		String sObj = new String("Hello$");
		String sObj1 = new String("hello");
		
		System.out.println("Comparing two string objects "+(sObj == sObj1));
		
		System.out.println("Comparing two string objects "+(sObj.equals(sObj1)));
		
		System.out.println("Comparing two string objects "+(sObj.equalsIgnoreCase(sObj1)));
		
		System.out.println("Comparing two string objects "+(sObj.substring(0,4)));
		
		System.out.println("Comparing two string objects "+(sObj.indexOf("$")));
		System.out.println("Comparing two string objects "+(sObj.charAt(4)));
		

	}
	
	private static void stringBuilder() {
		StringBuffer stringBuffer = new StringBuffer();
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.append(" ");
		stringBuilder.append("World");
		
		System.out.println("The vlaue of the string builder is "+stringBuilder.toString());
	}

}
