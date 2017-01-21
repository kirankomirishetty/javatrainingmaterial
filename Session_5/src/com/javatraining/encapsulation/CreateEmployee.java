/**
 * 
 */
package com.javatraining.encapsulation;

/**
 * @author kiran
 *
 */
public class CreateEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Sangeetha","QA","PHL");
		emp.setEmpSalary("$2000.00");
//		emp.setEmployeeNo("1001");
//		emp.setEmployeeName("Kiran");
//		emp.setEmployeeAddress("Newark DE");
//		emp.setEmployeeDept("TECH");
		
		System.out.println("--->"+emp.getEmployeeName()+" emp no "+emp.getEmployeeNo()+" salary "+emp.getEmpSalary());
		
		Employee emp1 = new Employee("Sonali","QA");
		System.out.println("emp1 "+emp1.getEmployeeName());
		

	}

}
