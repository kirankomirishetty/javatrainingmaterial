/**
 * 
 */
package com.javatraining.session3.enums;

/**
 * @author kiran
 *
 */
public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		performCalculation(Constants.OPERATION_ADD, 10, 20);
		performCalculation(Constants.OPERATION_DIV, 10, 20);
		performCalculation(Constants.OPERATION_SUB, 10, 20);
		performCalculation("ADD", 10, 20);
		
		performCalculation(MathOperationsEnum.ADD, 10, 20);
		performCalculation(MathOperationsEnum.DIV, 10, 20);
		performCalculation(MathOperationsEnum.SUB, 10, 20);
//		performCalculation("MUL", 10, 20);
		
		System.out.println("-->"+AllConstants.MathOperations.ADD.name()+"  \n"+AllConstants.EmployeeBands.B4.name());

	}
	
	public static void performCalculation(String operationType, int a, int b) {
		if(Constants.OPERATION_ADD.equalsIgnoreCase(operationType)) {
			System.out.println("Result of "+operationType +" is "+(a+b));
		}else if(Constants.OPERATION_DIV.equalsIgnoreCase(operationType)) {
			System.out.println("Result of "+operationType +" is "+(a/b));
		}else if(Constants.OPERATION_SUB.equalsIgnoreCase(operationType)) {
			System.out.println("Result of "+operationType +" is "+(a-b));
		}else {
			System.out.println("Invalid Operation Type...");
		}
			
		
	}
	public static void performCalculation(MathOperationsEnum operationType, int a, int b) {
		if(MathOperationsEnum.ADD == operationType) {
			System.out.println("Result of "+operationType +" is "+(a+b));
		}else if(MathOperationsEnum.DIV == operationType) {
			System.out.println("Result of "+operationType +" is "+(a/b));
		}else if(MathOperationsEnum.SUB == operationType) {
			System.out.println("Result of "+operationType +" is "+(a-b));
		}else {
			System.out.println("Invalid Operation Type...");
		}
			
		
	}

}
