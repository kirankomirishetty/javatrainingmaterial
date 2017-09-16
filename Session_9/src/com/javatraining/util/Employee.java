/**
 * 
 */
package com.javatraining.util;

/**
 * @author kiran
 *
 */
public class Employee {

	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	private String empNo;
	
	private String empName;

	public Employee(String empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}

	@Override
	public int hashCode() {
		return empName.hashCode() + empNo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		if(empName.equals(other.empName) && empNo.equals(other.empNo)){
			return true;
		}
		return false;
	}
	
	

}
