package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTO;
import com.xworkz.dp.dto.TimerDTO;

public class DoctorDAO {
	 
	private DoctorDTO[] doctorDTOs=new DoctorDTO[10];
	private int count;
	
	public void create(DoctorDTO dto) {
		System.out.println("Invoked Create method");
		if(this.count<this.doctorDTOs.length && dto!=null)
		{
			this.doctorDTOs[this.count++]=dto;
			System.out.println("The method is : ".concat(dto.getHospitalname()));
			System.out.println();
		}
		else {
			System.out.println("Create method is invalid");
		}
	}
	
	public void create(DoctorDTO dto,int fan) {
		// TODO Auto-generated method stub
		if(fan>=0 && fan<this.doctorDTOs.length && dto!=null) {
			this.doctorDTOs[fan]=dto;
			System.out.println("The create overload invoked ".concat(String.valueOf(dto.getAge())));
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
	public boolean matchSpecialization(String special) {
		System.out.println("Invoked the matching");

		for (int i = 0; i < doctorDTOs.length; i++) {
			DoctorDTO ref = this.doctorDTOs[i];

			if (ref != null) {
				System.out.println("The ref is not null at index : ".concat(String.valueOf(i)));

				String tempname = ref.getSpecialization();
				System.out.println("The  Brand is ".concat(tempname));

				if (special.equals(tempname)) {
					System.out.println("Specialzation found");
					return true;
				}
			}
		}
		System.out.println("Specialization not found");
		return false;
	}

}




