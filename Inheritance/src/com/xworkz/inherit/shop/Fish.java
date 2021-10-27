package com.xworkz.inherit.shop;

public class Fish {

	private String region = "pond";
	private boolean alive;

	public Fish() {
		this(true);
		// TODO Auto-generated constructor stub
		System.out.println("Invoked Fish no-arg constructor");
	}

	public Fish(boolean alive) {
		System.out.println("The fish region is : " + region + " ,and the fish is alive : ".concat(String.valueOf(alive)));
	}

}
