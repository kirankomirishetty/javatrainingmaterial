package com.javatraining.ploymorphism.overrriding;

public class ParentChildExample {
	
	public static void main(String[] args) {
		method(new Parent());
		method(new Child());
		
		method1(new Child());
	}
	
	public static void method(Parent p) {
		System.out.println("P..."+p.getClass().getSimpleName());
	}
	
	public static void method1(Child c) {
		System.out.println("C..."+c.getClass().getSimpleName());
	}

}
