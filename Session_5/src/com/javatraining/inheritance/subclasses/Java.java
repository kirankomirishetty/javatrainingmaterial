/**
 * 
 */
package com.javatraining.inheritance.subclasses;

import java.util.Arrays;

import com.javatraining.inheritance.superclasses.Course;

/**
 * @author kiran
 *
 */
public class Java extends Course {

	String[] eligibilityCriteria; 
	
	
	public Java(int fees, int duration,int noOfStudentsPerBatch )
	{
		super("Java", fees, duration, noOfStudentsPerBatch);
		this.eligibilityCriteria = new String[] {"Basic java","C","C++"};
		
	}
	
	public boolean checkEligibiltyAndEnroll(String qualification)
	{
		// for(int i=0;i<this.eligibilityCriteria.length;i++){
		/*
		 * String eligibility = this.eligibilityCriteria[i];
		 * if(eligibility.equalsIgnoreCase(qualification)) {
	    		this.enroll();
	    		return true;
	    	}
		 * */
		//	}
//		String s = "12345";
	    for(String eligibility:this.eligibilityCriteria) {
	    	System.out.println("--->"+eligibility);
	    	if(eligibility.equalsIgnoreCase(qualification)) {
	    		this.enroll();
	    		return true;
	    	}
	    }
		System.out.println("Student not enrolleed, try enrolling one of "+Arrays.asList(this.eligibilityCriteria));
		return false;
	}

}
