/**
 * 
 */
package com.javatraining.session4;

/**
 * @author kiran
 *
 */
public class CreateStudent {
	private static Student student = new Student();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
//		student.setStudentRollNo("A1");
		student.setStudentName("Sangeetha");
		student.setDegreeAwarded("MS");
		
		System.out.println("Stuent name = "+student.getStudentName()+" roll no "+student.getStudentRollNo());
		
		Student stu = new Student("Sonali", "MBA");
		System.out.println("Stuent name = "+stu.getStudentName()+" roll no "+stu.getStudentRollNo());
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().freeMemory();

	}

}
