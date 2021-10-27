package com.xworkz.dp;

import com.xworkz.dp.dao.CircusDAO;
import com.xworkz.dp.dto.CircusDTO;

public class CircusStarter {
	
	public static void main(String[] args) {
		
		CircusDTO circusDTO=new CircusDTO("Varsha", 250.0F, 12, 3, "1 hour");
		CircusDAO circusDAO = new CircusDAO();
		CircusDTO circusDTO2 = new CircusDTO("subbu", 300.0f, 13, 4, "45 min");
		
		circusDAO.create(new CircusDTO("Teju", 450.25F, 10, 5, "2 Hours"));
		circusDAO.create(circusDTO2);
		circusDAO.delete(0);
	    circusDAO.update(circusDTO2, 1);
	    
	    int DAO=circusDAO.indexOccupied();
	    System.out.println("The idex occupied is : ".concat(String.valueOf(DAO)));
	    System.out.println();
	    
	    boolean DAO1=circusDAO.matchCircus("30 min");
	    System.out.println("The matching is : ".concat(String.valueOf(DAO1)));
		
	}

}
