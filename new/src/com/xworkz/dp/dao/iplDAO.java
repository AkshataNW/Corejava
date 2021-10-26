package com.xworkz.dp.dao;

import com.xworkz.dp.dto.iplDTO;

public class iplDAO {
	
	private iplDTO[] iplDTOs = new iplDTO[99];
	private int count=0;
	
	public void create(iplDTO dto) {
		System.out.println("Invoked Create method");
		if(this.count<this.iplDTOs.length && dto!=null) {
		this.iplDTOs[this.count++]=dto;
		
		System.out.println("The team name is : ".concat(dto.getTeamName()));
		System.out.println();
		}
		else {
			System.err.println("Create method is invalid");
		}

	}
	
	public void create(iplDTO dto,int index) {
		
		if(index>=0 && index<this.iplDTOs.length && dto!=null) {
		System.out.println("Invoked Create oveload ");
		this.iplDTOs[index]=dto;
		this.count++;
		System.out.println("The team name is : ".concat(dto.getTeamName()));
		System.out.println();
		}
		else {
			System.err.println("create method is invalid  ");
			System.out.println();
		}
		
	}
	
	public int indexOccupied() {
		return this.count;
	}
	
	public boolean matchIplTeam(String teamname) {
	System.out.println("Invoked match ipl team");
	System.out.println();
	
    for (int i = 0; i < iplDTOs.length; i++) {
	 iplDTO	ref=this.iplDTOs[i];
	 
	 if(ref!=null) {
	 System.out.println("ref in index is not null ".concat(String.valueOf(i)));
	 
	 String tempname=ref.getTeamName();
	 System.out.println("Matching ".concat(tempname));
	 
	 if(teamname.equals(tempname)) {
		 System.out.println("Teamname Found");
		 return true;
	 }
	}
	}
    return false;
	}
	
	}
