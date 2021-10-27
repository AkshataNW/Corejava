package com.xworkz.inherit.shop;

public class NaturalSaloon extends Saloon {
	
	private String name="varsha";
	private int noOfEmployees;
	
	public NaturalSaloon() {
		//super()//Super is not there;
		this("Loreal Paris");
		// TODO Auto-generated constructor stub
		System.out.println("Invoked NaturalSaloon no-arg constructor");
	}
	
	public NaturalSaloon(String name) {
		System.out.println("The natural Saloon name is : ".concat(name));
		
	}
	
	public NaturalSaloon(int noOfEmployees) {
		System.out.println("The number of Employees in Natural Saloon : ".concat(String.valueOf(noOfEmployees)));
	}

}
