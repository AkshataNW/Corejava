package com.xworkz.crud;

import com.xworkz.crud.operators.Island;

public class IslandStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Island island=new Island();
		System.out.println(island.getCountry());
		island.addIslandName("Andaman Island");
		island.addIslandName("Neil Island");
		island.addIslandName("Havelock Island");
		island.addIslandName("Barren Island");
		island.addIslandName("Divar Island");
		island.displayDetails();

	}

}
