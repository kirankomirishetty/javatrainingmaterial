/**
 * 
 */

package com.java.training.packge.two;
import com.java.training.packge.one.PackageTest1;

/**
 * @author kiran
 *
 */
public class PackageTest2 {

	static PackageTest1 packageTest1 = new PackageTest1();
	public static void main(String[] args) {
		packageTest1.sayHello("Kiran");
		packageTest1.sayGoodBye("Kiran");
		PackageTest3 packageTest3 = new PackageTest3();
		packageTest3.sayHello("Sangeetha");
		packageTest3.sayGoodBye("Sangeetha");
	}
}
