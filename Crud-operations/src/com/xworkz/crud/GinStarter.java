package com.xworkz.crud;

import com.xworkz.crud.operators.Gin;

public class GinStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gin gin = new Gin();
		System.out.println(gin.getEst());
		gin.addGinName("Alcohol");
		gin.addGinName("grain");
		gin.addGinName("Barley");
		gin.displayDetails();
	}

}
