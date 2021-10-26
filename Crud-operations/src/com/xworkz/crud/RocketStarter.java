package com.xworkz.crud;

import com.xworkz.crud.operators.Rocket;

public class RocketStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rocket rocket=new Rocket();
		System.out.println(rocket.getLaunch());
		rocket.addRocketName("Polar Satellite");
		rocket.addRocketName("Geosynchronous Satellite");
		rocket.addRocketName("Rohini");
		rocket.addRocketName("Avatar");
		rocket.addRocketName("Augmented Satellite");
		rocket.displayDetails();
	}

}
