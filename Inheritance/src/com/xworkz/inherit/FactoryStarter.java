package com.xworkz.inherit;

import com.xworkz.inherit.shop.Factory;
import com.xworkz.inherit.shop.SugarFactory;

public class FactoryStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory factory=new Factory();
		System.out.println();
		
//	   factory=new Factory(500000.000F);
//       System.out.println();
		
		Factory sugarFactory =new SugarFactory("Sugar", "Akshata");
		System.out.println();
		
		factory=new SugarFactory();
		System.out.println();
		
		Object object=new Factory("SUGARFACTORY");
		object=new Factory("CANE FACTORY");

	}

}
