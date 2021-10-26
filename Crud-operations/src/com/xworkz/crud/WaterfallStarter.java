package com.xworkz.crud;

import com.xworkz.crud.operators.Waterfall;

public class WaterfallStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Waterfall waterfall=new Waterfall();
		System.out.println(waterfall.getState());
		waterfall.addWaterfallName("Sathodi falls");
		waterfall.addWaterfallName("Jog falls");
		waterfall.addWaterfallName("Abbi falls");
		waterfall.addWaterfallName("unchalli falls");
		waterfall.addWaterfallName("Magod falls");
		waterfall.displayDetails();
		
	}

}
