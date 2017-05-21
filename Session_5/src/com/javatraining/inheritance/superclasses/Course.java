package com.javatraining.inheritance.superclasses;

public class Course {
	private String courseName;
	private int fees;
	private int duration;
	private int noOfStudentsPerBatch;

	
	public Course(String courseName,int fees,int duration,int noOfStudentsPerBatch)
	{
		this.courseName= courseName;
		this.fees= fees;
		this.duration= duration;
		this.noOfStudentsPerBatch = noOfStudentsPerBatch;
				
	}
	
	protected void enroll()
	{
		System.out.println  ("Enrolled for Coursename " + this.courseName + "\n" + "Fees " + this.fees + "\n" + "Duration of course " +  this.duration + "\n" +
							 "No of students " +  this.noOfStudentsPerBatch);
		
	}
	
	
	
}
