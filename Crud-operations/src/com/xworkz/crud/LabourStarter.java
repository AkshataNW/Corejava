package com.xworkz.crud;

import com.xworkz.crud.operators.Labour;

public class LabourStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Labour drink= new Labour();
		drink.addWork("Accountant");
		drink.addWork("Teacher");
		drink.addWork("Driver");
		drink.addWork("Associate Engineer");
		drink.addWork("Coolie");
		drink.addWork("Tailor");
		drink.addWork("Business Man");	
		drink.deleteReference(8);
		drink.UpdateWork(3,null);
		drink.displayWork();

	}

}
