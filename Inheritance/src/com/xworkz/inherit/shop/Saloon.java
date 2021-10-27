package com.xworkz.inherit.shop;

public class Saloon {
	
	public String name="hhhhhh";
	private int noOfEmployees;

	
	public Saloon() {
		// TODO Auto-generated constructor stub
		System.out.println("Invoked Saloon no-arg constructor");
	}
	
	public Saloon(String name) {
		System.out.println("The name of the saloon is : ".concat(name));
	}
	
	public Saloon(int noOfEmployees) {
		System.out.println("The number of employees in saloon : ".concat(String.valueOf(noOfEmployees)));
	}
	
	
	
}
