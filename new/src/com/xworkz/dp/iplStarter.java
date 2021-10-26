package com.xworkz.dp;

import com.xworkz.dp.dao.iplDAO;
import com.xworkz.dp.dto.iplDTO;

public class iplStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		iplDTO dto=new iplDTO("RCB", 12, 24 , "USL", "VIVO");
		iplDAO dao =new iplDAO();
		iplDTO dto2=new iplDTO("KKR", 12, 20, "Sharuk", "OPPO");
		
		dao.create(new iplDTO("MI", 12, 24,"Ambani" , "PUMA"));
		dao.create(null);
		dao.create(dto2);
		dao.create(dto, 1);
		
		int dao1=dao.indexOccupied();
		System.out.println("The index occupied is : ".concat(String.valueOf(dao1)));
		System.out.println();

        boolean dao2=dao.matchIplTeam("MI");
        System.out.println();
        System.out.println("The IPL Team is : ".concat(String.valueOf(dao2)));
		
		
		

	}

}
