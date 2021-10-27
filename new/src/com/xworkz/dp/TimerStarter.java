package com.xworkz.dp;

import com.xworkz.dp.dao.TimerDAO;
import com.xworkz.dp.dto.TimerDTO;

public class TimerStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerDTO timerDTO = new TimerDTO(false, true, true, false, "Sonata");
		TimerDTO timerDTO2 = new TimerDTO(false, false, false, true, "fastrack");
		TimerDAO timerDAO = new TimerDAO();
		timerDAO.create(timerDTO2);
		timerDAO.create(timerDTO, 1);
		
		int kachori=timerDAO.indexOccupied();
		System.out.println("The index occupied is ".concat(String.valueOf(kachori)));
		System.out.println();
		
         boolean kachori1=timerDAO.matchBrand("fastrack");
         System.out.println("The match is : ".concat(String.valueOf(kachori1)));
	}

	}


