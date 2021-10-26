package com.xworkz.dp;

import com.xworkz.dp.constants.Genre;
import com.xworkz.dp.dao.WebSeriesDAO;
import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesStarter {
	
	public static void main(String[] args) {
		
		WebSeriesDTO dtos = new WebSeriesDTO();
		WebSeriesDAO dao=new WebSeriesDAO();
		
		WebSeriesDTO dtos1=new WebSeriesDTO(Genre.ADVENTURE, "Vampire Diaries", 23, 8, 98.8F, 7, "Ian Samorhalder");
		WebSeriesDTO dtos2=new WebSeriesDTO(Genre.ADVENTURE, "Vampire Diaries", 23, 8, 98.8F, 7, "Nina Dobrev");
		WebSeriesDTO dtos3=new WebSeriesDTO(Genre.ADVENTURE, "Vampire Diaries", 23, 8, 98.8F, 7, "Candice king");
		WebSeriesDTO dtos4=new WebSeriesDTO(Genre.ADVENTURE, "Vampire Diaries", 23, 8, 98.8F, 7, "paul Wisley");
	
		WebSeriesDTO[] seriesDTOs=dao.getWebseriesDTOs();
		seriesDTOs[0]=dtos1;
		seriesDTOs[1]=dtos2;
		seriesDTOs[2]=dtos3;
		seriesDTOs[3]=dtos4;
	for (int i = 0; i < seriesDTOs.length; i++) {
		WebSeriesDTO ref=seriesDTOs[i];
		if(ref!=null) {
			System.out.println(" ");
			System.out.println(ref.getCast());
			System.out.println(ref.getCurrentSeason());
			System.out.println(ref.getName());
			System.out.println(ref.getNoOfCharacters());
			System.out.println(ref.getNoOfSeasons());
			System.out.println(ref.getRatings());
			System.out.println(ref.getGenre());
		}
		else {
			System.err.println("array is full with index or ref is null".concat(String.valueOf(i)));
	}
			
		}	
		
	}

}
