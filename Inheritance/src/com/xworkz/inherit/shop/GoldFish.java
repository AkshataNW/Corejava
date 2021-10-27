package com.xworkz.inherit.shop;

public class GoldFish extends Fish {

	private String color= "Gold";
	private String size;

	public GoldFish() {
		this("12cm");
		// TODO Auto-generated constructor stub
		System.out.println("Invoked GoldFish no-arg constructor");
	}

	public GoldFish(String size) {
		System.out.println("The color of gold fish is : " + color + " and size of the fish is " + size);
	}

}
