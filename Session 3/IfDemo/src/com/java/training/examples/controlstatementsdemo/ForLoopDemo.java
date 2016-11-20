/**
 * 
 */
package com.java.training.examples.controlstatementsdemo;

/**
 * @author kiran
 *
 */
public class ForLoopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		simpleForLoop();
		optionalParamsForLoop(15);
		oneDimensionalArray();
		twoDimensionalArray();
	}
	
	public static void simpleForLoop(){
		System.out.println("Inside simpleForLoop.....");
		for(int i=0;i<10;i+=2) {
			System.out.print(i+",");
		}
	}
	public static void optionalParamsForLoop(int i){
		System.out.println("\nInside optionalParamsForLoop.....");
		for(;i<20;) {
			System.out.print((i++)+",");
		}
	}
	public static void oneDimensionalArray() {
		System.out.println("\nOne Dimensional array ");
		int[] integer = {10,20,30,40,50};
		System.out.println("the value of integer at index 4 is "+integer[3]);
		
		for(int i=0;i<integer.length;i++) {
			System.out.print(integer[i]+",");
		}
		
	}
	public static void twoDimensionalArray() {
		System.out.println("\nOne Dimensional array ");
		int[][] integer = {
							{1,2},
							{3,4,1035},
							{5,6,10},
							{7,8,11,111,56},
							{9,0,44,77}
						};
		System.out.println("the value of integer at index 4 is "+integer[3]);
		
		for(int i=0;i<integer.length;i++) {
			for(int j=0;j<integer[i].length;j++) {
				System.out.println(i+" "+j+" "+integer[i][j]);
			}
		}
		
	}
	public static void whileDemo(int i) {
		System.out.println("Inside While demo......");
		while(i<=20){
			System.out.println("value of i is "+(i++));
			// i++ is equal to (i = i + 1)
		}
	}

}
