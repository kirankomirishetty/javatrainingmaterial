/**
 * 
 */
package com.javatraining.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author kiran
 *
 */
public class CollectionsDemo {

	/**
	 * 
	 */
	public CollectionsDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] str = new String[] {"30","20","10","30","10"};
		for(int i = 0; i<str.length ;i++) {
			System.out.println(str[i]);
		}
		hashCodeEx();
//		toStringEx();
//		arrayListEx();
//		System.out.println("------");
//		setEx();

	}
	
	
	private static void hashCodeEx() {
		Employee emp1 = new Employee("100","Testing");
		Employee emp2 = new Employee("100","Testing");
		
		System.out.println("Employee object comparision "+emp1.equals(emp2));
		System.out.println("Emp1 hashcode "+emp1.hashCode());
		System.out.println("Emp2 hashcode "+emp2.hashCode());
		
		String str1 = "Testing";
		String str2 = "Testing";
		
		System.out.println(str1.hashCode()+"  "+str2.hashCode()+ " "+str1.equals(str2));

	}
	
	private static void setEx() {
		SortedSet<String> set = new TreeSet<String>();
		//set pointer
		set.add("bbb");
		set.add("eee");
		set.add("aaa");
		set.add("ddd");
		set.add("ccc");
		set.add("ccc");
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	private static void toStringEx() {
		Employee emp = new Employee("100", "John");
		System.out.println("Employe is "+emp.toString());
		Employee emp1 = new Employee("100", "John");
		System.out.println("Employe is "+emp);
		
		System.out.println("Object equality is "+emp.equals(emp1));
	}
	
	private static void arrayListEx() {
		List<String> list = new ArrayList<>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println("List size "+list.size());
		System.out.println("Index of "+list.indexOf("bbb"));
		list.remove("bbb");
		list.remove(0);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----");
		for(String str:list) {
			System.out.println(str);
		}
		
		List<String> list1 = new ArrayList();
		list1.add("ddd");
		list1.add("eee");
		
		list.addAll(list1);
		
		System.out.println("list values "+list);
	}

}
