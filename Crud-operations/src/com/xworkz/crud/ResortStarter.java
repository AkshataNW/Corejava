package com.xworkz.crud;

import com.xworkz.crud.operators.Resort;

public class ResortStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Resort resort=new Resort();
		System.out.println(resort.getQuality());
		resort.addResortName("Palm Bliss");
		resort.addResortName("cupcake");
		resort.addResortName("Winter Crystal");
		resort.addResortName("Villa Florence");
		resort.addResortName("Spectra");
		resort.displayDetails();

	}

}
