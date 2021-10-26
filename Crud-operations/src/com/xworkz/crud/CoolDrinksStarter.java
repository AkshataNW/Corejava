package com.xworkz.crud;

import com.xworkz.crud.operators.CoolDrinks;

public class CoolDrinksStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoolDrinks cold = new CoolDrinks();
		System.out.println(cold.getBrand());
		
		cold.addCoolDrinks("Coke");
		cold.addCoolDrinks("Dew");
		cold.addCoolDrinks("Pepsi");
		cold.addCoolDrinks("mazza");
		cold.addCoolDrinks("mirinda");
		cold.addCoolDrinks("Slice");
		cold.addCoolDrinks("Sprite");
		cold.addCoolDrinks("lime");
		cold.delete(5);
		cold.update(2, "Akshata");
		cold.displaydetails();
				

	}

}
