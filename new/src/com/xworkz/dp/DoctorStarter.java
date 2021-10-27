package com.xworkz.dp;

import com.xworkz.dp.dao.DoctorDAO;
import com.xworkz.dp.dto.DoctorDTO;

public class DoctorStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoctorDTO dto=new DoctorDTO("Aksh", "Heart", "Fortis", "Female", 24);
		DoctorDAO dao = new DoctorDAO();
		DoctorDTO dto2 = new DoctorDTO("kempi", "Brain", "kakada", "Female", 21);
		dao.create(new DoctorDTO("Dummi", "Cancer", "PG", "Female", 25));
		dao.create(dto2, 0);
		
		int kachori=dao.indexOccupied();
		System.out.println("The index occupied is ".concat(String.valueOf(kachori)));
		System.out.println();
		
         boolean kachori1=dao.matchSpecialization("Brain");
         System.out.println("The match is : ".concat(String.valueOf(kachori1)));
	}

	

	}

