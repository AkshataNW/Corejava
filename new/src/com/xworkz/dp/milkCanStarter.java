package com.xworkz.dp;

import com.xworkz.dp.dao.milkCanDAO;
import com.xworkz.dp.dto.MilkcanDTO;

public class milkCanStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MilkcanDTO milkcanDTO=new MilkcanDTO("2 lit", "Cylinder", false, "White", 250.0F);
		MilkcanDTO milkcanDTO2 = new MilkcanDTO("3 lit", "round", true, "Silver", 50.0F);
		milkCanDAO canDAO=new milkCanDAO();
		canDAO.create(new MilkcanDTO("4 lit", "Cylinder", true, "Black", 25.0F));
		canDAO.create(milkcanDTO2, 1);
		
		
		int kachori=canDAO.indexOccupied();
		System.out.println("The index occupied is ".concat(String.valueOf(kachori)));
		System.out.println();
		
         boolean kachori1=canDAO.matchquantity("5 lit");
         System.out.println("The match is : ".concat(String.valueOf(kachori1)));
	}

}
