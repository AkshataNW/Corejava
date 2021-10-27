package com.xworkz.dp;

import com.xworkz.dp.dao.MovieDAO;
import com.xworkz.dp.dto.MovieDTO;

public class MovieStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieDTO dto=new MovieDTO("Kotigobba 3", "Venkatesh", "Sudeep", "4.9 rating", " teji");
		MovieDAO dao = new MovieDAO();
		MovieDTO dto2=new MovieDTO("Kirik party", "Akshata", "Rakshit Shetty", "5 rating", "Rashmika");
		dao.create(new MovieDTO("Rathnanprapancha", "Varsha", "Dolly", "5 rating", "soubi"));
		dao.create(dto2, 0);
		dao.create(dto);

		int kachori=dao.indexOccupied();
		System.out.println("The index occupied is ".concat(String.valueOf(kachori)));
		System.out.println();
		
         boolean kachori1=dao.matchname("Kirik party");
         System.out.println("The match is : ".concat(String.valueOf(kachori1)));
	}

	
	}


