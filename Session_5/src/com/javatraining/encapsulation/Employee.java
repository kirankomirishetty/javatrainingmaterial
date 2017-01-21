/**
 * 
 */
package com.javatraining.encapsulation;

import java.util.Random;

/**
 * @author kiran
 *
 */
public class Employee {

	private String employeeNo;
	
	private String employeeName;
	
	private String employeeDept;
	
	private String employeeAddress;
	
	private String empSalary;

	public Employee(String employeeName, String employeeDept,String employeeAddress) {
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeDept = employeeDept;
	}
	public Employee(String employeeName, String employeeDept) {
		this.employeeName = employeeName;
//		this.employeeAddress = employeeAddress;
		this.employeeDept = employeeDept;
	}

	public String getEmployeeNo() {
		Random random = new Random();
		int randomEmpNo = random.nextInt(10000);
		this.employeeNo = ("A"+randomEmpNo);
		return this.employeeNo;
	}
	
	

//	public void setEmployeeNo(String employeeNo) {
//		this.employeeNo = employeeNo;
//	}

	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}

//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}

	public String getEmployeeDept() {
		return employeeDept;
	}

//	public void setEmployeeDept(String employeeDept) {
//		this.employeeDept = employeeDept;
//	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

//	public void setEmployeeAddress(String employeeAddress) {
//		this.employeeAddress = employeeAddress;
//	}
	
	

}
