package com.xworkz.dp;

import com.xworkz.dp.dao.WalletDAO;
import com.xworkz.dp.dto.WalletDTO;
import com.xworkz.dp.dto.iplDTO;

public class WalletStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WalletDTO walletDTO=new WalletDTO("Allensolly", "Leather", 7, 900.0F, 2);
        WalletDAO walletDAO=new WalletDAO();
		WalletDTO walletDTO2=new WalletDTO("Woodland", "foamleather", 9, 150.0F, 3);
	
	   
	   walletDAO.create(new WalletDTO("Master", "Jeans", 4, 2000.0F, 5));
	   walletDAO.create(walletDTO2);
	   walletDAO.create(null);
	  walletDAO.create(walletDTO, 0);
	   
	    int wall=walletDAO.indexOccupied();
	    System.out.println("The index occupied is ".concat(String.valueOf(wall)));
	    System.out.println();
	    
	    boolean wall1=walletDAO.matchWallet("Woodland");
	    System.out.println();
	    System.out.println("The wallmatch is ".concat(String.valueOf(wall1)));

		
		
		

	    
	
	}

}
