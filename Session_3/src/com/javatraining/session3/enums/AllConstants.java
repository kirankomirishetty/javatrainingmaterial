/**
 * 
 */
package com.javatraining.session3.enums;

/**
 * @author kiran
 *
 */
public class AllConstants {
	
	public enum MathOperations{
		ADD,DIV,SUB;
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			String values=this.ADD.name()+","+this.SUB.name();
			return values;
		}
	}
	
	public static enum EmployeeBands{
		B4,B5,B6,SE,E;
	}

}
