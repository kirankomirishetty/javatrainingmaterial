/**
 * 
 */

/**
 * @author kiran
 *
 */
public class PrimitiveDataTypesExample {

	HelloWorld hw = new HelloWorld();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean b = true;
		System.out.println("Default Value of boolean "+b);
		char c = 'a', c1='\u0041', c2=66;
		System.out.println("Default Value of char "+c+" "+c1+" "+c2);
		
		byte by = -127;
		System.out.println("Default value of a byte "+by);
		
		int i = 123;
		System.out.println("Default value of i int "+i);
		
		long l = 1234567890987654367l;
		System.out.println("Default value of l long "+l);
		
		float f = 0.1001f;
		System.out.println("Default float value is "+f);
		
		double d = 100.4534d;
		System.out.println("Default double value is "+d);
	}

}
