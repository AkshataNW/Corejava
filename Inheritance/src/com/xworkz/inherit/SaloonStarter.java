package com.xworkz.inherit;

import com.xworkz.inherit.shop.NaturalSaloon;
import com.xworkz.inherit.shop.Saloon;

public class SaloonStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Saloon saloon=new Saloon();
	    NaturalSaloon naturalSaloon=new NaturalSaloon();
		System.out.println();
		Saloon saloon =new NaturalSaloon(4);
		
		System.out.println();
		
		Saloon saloon3=new Saloon("Green traits");
		Saloon saloon2=new Saloon(3);
		
		
		
		

	}

}
