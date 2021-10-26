package com.xworkz.crud;

import com.xworkz.crud.operators.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Stadium operator=new Stadium(); 
		
		operator.addStadiumName("Kantirava Stadium");
		operator.addStadiumName("NehARU Stadium");
		operator.addStadiumName("R N Shetty");
		operator.addStadiumName("xyz");
		operator.addStadiumName("abc");
		operator.deleteStadiumName(0);
		operator.updateStadiumName(0, "tej");
		operator.displayStadiumNames();

	}
	}


