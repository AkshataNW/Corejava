package com.xworkz.inherit.shop;

public class SharkFish extends Fish {

	String height = "19cm";
	String weight;

	public SharkFish() {
		this("0.5kg");
		// TODO Auto-generated constructor stub
		System.out.println("Invoked Sharkfish no-arg constructor");
	}

	public SharkFish(String weight) {
		System.out.println("The height of the fish is : " + height + " and weight is  " + weight);
	}

}
