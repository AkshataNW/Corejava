package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WalletDTO;

public class WalletDAO {
	
	private WalletDTO[] walletDTOs = new WalletDTO[10];
	private int count=0;
	
	public void create(WalletDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("Invoked Create Method");
		if(this.count<this.walletDTOs.length && dto!=null) {
		this.walletDTOs[this.count++]=dto;
		
		System.out.println("The create method ".concat(dto.getCompanyName()));
		System.out.println();
		}
		else {
			System.err.println("Create method is invalid");
		}
	}
	
	public void create(WalletDTO dto , int index) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Invoked create overload method");
		if(index>=0 && index<this.walletDTOs.length && dto!=null) {
		this.walletDTOs[index]=dto;
		System.out.println("The company name is ".concat(dto.getCompanyName()));
		System.out.println();
		}
		else {
			System.out.println("Create overload is invalid");
			}
	}
	
	public int indexOccupied() {
		// TODO Auto-generated method stub
		return this.count;
		
	}
	
	public boolean matchWallet(String wallname) {
		// TODO Auto-generated method stub
     System.out.println("Invoked matchWallet name");
     
     for (int i = 0; i < walletDTOs.length; i++) {
    	 WalletDTO ref =this.walletDTOs[i];
    	 
    	 if(ref!=null) {
    		 System.out.println("The ref index is not null ".concat(String.valueOf(i)));
    	 }
    	 
    	String tempname =ref.getCompanyName();
    	System.out.println("Matching ".concat(tempname));
    	
    	if(wallname.equals(tempname)) {
    		System.out.println("Wallet found");
    		return true;
    	}
     }
	
	return false;
}

 }
	
	


