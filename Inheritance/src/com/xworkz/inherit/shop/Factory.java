package com.xworkz.inherit.shop;

public class Factory extends Object {

	private String owner;
	private String production;
	private float revenue;
	private String name;

	public Factory() {
		// TODO Auto-generated constructor stub
		System.out.println("Invoked factory no-arg constructor");
	}

	public Factory(String name) {
		this(50000.00F);
		System.out.println("The name of the factory is : ".concat(name));
	}

	public Factory(float revenue) {
		System.out.println("The revenue of the factory is ".concat(String.valueOf(revenue)));
	}

}
