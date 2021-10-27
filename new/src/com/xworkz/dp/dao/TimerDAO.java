package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MilkcanDTO;
import com.xworkz.dp.dto.TimerDTO;

public class TimerDAO {
	
	private TimerDTO[] dtos=new TimerDTO[10];
	private int count;
	
	public void create(TimerDTO dto) {
		System.out.println("Invoked Create method");
		if(this.count<this.dtos.length && dto!=null)
		{
			this.dtos[this.count++]=dto;
			System.out.println("The method is : ".concat(dto.getBarnd()));
			System.out.println();
		}
		else {
			System.out.println("Create method is invalid");
		}
	}
	
	public void create(TimerDTO dto,int fan) {
		// TODO Auto-generated method stub
		if(fan>=0 && fan<this.dtos.length && dto!=null) {
			this.dtos[fan]=dto;
			System.out.println("The create overload invoked ".concat(String.valueOf(dto.isWorking())));
			this.count++;
			System.out.println();
		}
		else
		{
			System.err.println("Create overload is invalid");
		}
		}
	
	public int indexOccupied() {
		// TODO Auto-generated method stub
		return this.count;
		
	}
	public boolean matchBrand(String brand) {
		System.out.println("Invoked the matching");

		for (int i = 0; i < dtos.length; i++) {
			TimerDTO ref = this.dtos[i];

			if (ref != null) {
				System.out.println("The ref is not null at index : ".concat(String.valueOf(i)));

				String tempname = ref.getBarnd();
				System.out.println("The  Brand is ".concat(tempname));

				if (brand.equals(tempname)) {
					System.out.println("Brand found");
					return true;
				}
			}
		}
		System.out.println("Brand not found");
		return false;
	}

}


