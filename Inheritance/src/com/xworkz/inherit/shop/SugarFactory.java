package com.xworkz.inherit.shop;

public class SugarFactory extends Factory {

	public SugarFactory() {
		super(50000.0F);
		System.out.println("Invoked SugarFactory no-arg constructor");
	}
	
	public SugarFactory(String production, String owner) {
		System.out.println("The owner of the sugar factory is ".concat(owner) + " and the production is ".concat(production));
	}
		
	}

