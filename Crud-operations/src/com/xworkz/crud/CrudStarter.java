package com.xworkz.crud;

import com.xworkz.crud.operators.Chocolate;
import com.xworkz.crud.operators.beachoperators;

public class CrudStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		beachoperators beach = new beachoperators();
		String cname = beach.getCountry();
		System.out.println(cname);
		beach.addbeachname("OM beach");
		beach.addbeachname("NTIK beach");
		beach.addbeachname("RK beach");
		beach.addbeachname("karwar beach");
		beach.addbeachname("Baga beach");
		beach.addbeachname("pallolem ");
		beach.displaybeachname();
	}

}
