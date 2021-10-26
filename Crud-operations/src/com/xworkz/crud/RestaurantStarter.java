package com.xworkz.crud;

import com.xworkz.crud.operators.Restaurant;

public class RestaurantStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurant food = new Restaurant();
		System.out.println("The type of restaurant are :  "+food.getStyle());
		food.addRestaurantName("Panjurli");
		food.addRestaurantName("Gokul");
		food.addRestaurantName("Dennison");
		food.addRestaurantName("clerks INN");
		food.addRestaurantName("Ananth");
		food.addRestaurantName("Naveen");
		food.displayDetails();
	}
		

}
