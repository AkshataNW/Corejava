package com.xworkz.crud;

import com.xworkz.crud.operators.Coffee;

public class CoffeeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee drink=new Coffee(); 
		drink.addBrand("Bru");
		drink.addBrand("Nescafe");
		drink.addBrand("Levista");
		drink.addBrand("Mcafe");
		drink.deleteReference(8);
		drink.UpdateWork(3,null);
		drink.displayBrand();
	}

}
