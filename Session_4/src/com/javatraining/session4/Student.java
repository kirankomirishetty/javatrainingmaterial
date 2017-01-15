/**
 * 
 */
package com.javatraining.session4;

import java.util.Random;

/**
 * @author kiran
 *
 */
public class Student {
	
	private String studentName;
	
	private String studentRollNo;
	
	private String degreeAwarded;
	
	

	public Student() {
		super();
	}

	public Student(String studentName, String degreeAwarded) {
		super();
		this.studentName = studentName;
//		this.studentRollNo = studentRollNo;
		this.degreeAwarded = degreeAwarded;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentRollNo() {
		// Auto generation logic
//		Random random = 
		return Math.random()+"";
	}

	/*public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}*/

	public String getDegreeAwarded() {
		return degreeAwarded;
	}

	public void setDegreeAwarded(String degreeAwarded) {
		this.degreeAwarded = degreeAwarded;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Inside the finalize method...");
		super.finalize();
		
	}
	
	

}
