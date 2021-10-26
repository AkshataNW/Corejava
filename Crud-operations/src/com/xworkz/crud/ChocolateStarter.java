package com.xworkz.crud;

import com.xworkz.crud.operators.Chocolate;

public class ChocolateStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chocolate choco=new Chocolate();
		System.out.println("The product name is :  "+choco.getProduct());
		choco.addChocolateName("Dairymilk");
		choco.addChocolateName("5 Star");
		choco.addChocolateName("Kit-Kat");
		//choco.addChocolateName("Munch");
		choco.addChocolateName("Ferrero Rocher");
		choco.displayDetails();
	}

}
