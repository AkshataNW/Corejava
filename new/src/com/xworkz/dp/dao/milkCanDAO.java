package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CircusDTO;
import com.xworkz.dp.dto.MilkcanDTO;

public class milkCanDAO {

	
	private MilkcanDTO[] milkcanDTOs= new MilkcanDTO[10];
	private int count;
	
	public void create(MilkcanDTO dto) {
		System.out.println("Invoked Create method");
		if(this.count<this.milkcanDTOs.length && dto!=null)
		{
			this.milkcanDTOs[this.count++]=dto;
			System.out.println("The method is : ".concat(dto.getQuantity()));
			System.out.println();
		}
		else {
			System.out.println("Create method is invalid");
		}
	}
	
	public void create(MilkcanDTO dto,int fan) {
		// TODO Auto-generated method stub
		if(fan>=0 && fan<this.milkcanDTOs.length && dto!=null) {
			this.milkcanDTOs[fan]=dto;
			System.out.println("The create overload invoked ".concat(dto.getColor()));
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
	public boolean matchquantity(String quantity) {
		System.out.println("Invoked the matching");

		for (int i = 0; i < milkcanDTOs.length; i++) {
			MilkcanDTO ref = this.milkcanDTOs[i];

			if (ref != null) {
				System.out.println("The ref is not null at index : ".concat(String.valueOf(i)));

				String tempname = ref.getQuantity();
				System.out.println("The quantity  is ".concat(tempname));

				if (quantity.equals(tempname)) {
					System.out.println("quantity found");
					return true;
				}
			}
		}
		System.out.println("quantity not found");
		return false;
	}

}


