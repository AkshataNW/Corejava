package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CircusDTO;

public class CircusDAO {

	private CircusDTO[] circusDTOs = new CircusDTO[10];
	private int kachori = 0;

	public void create(CircusDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("Invoked create method");
		if (this.kachori < this.circusDTOs.length && dto != null) {
			this.circusDTOs[this.kachori++] = dto;
			System.out.println("The animals in circus are : ".concat(String.valueOf(dto.getNoOfAnimals())));
			System.out.println();
		} else {
			System.err.println("Create method is invalid");
		}

	}

	public void delete(int index) {
		System.out.println("Invoked delete method");

		if (index < this.circusDTOs.length && index >= 0) {
			this.circusDTOs[index] = null;
			System.out.println("The index is null at : " + index);
			System.out.println();
		} else {
			System.err.println("The delete method is invalid");
		}

	}

	public void update(CircusDTO dto, int index) {
		System.out.println("invoked update method");
		if (index >= 0 && index < this.circusDTOs.length && dto != null) {
			this.circusDTOs[index] = dto;
			System.out.println("The shows in circus ".concat(String.valueOf(dto.getNoOfShows()))
					+ " at the index ".concat(String.valueOf(index)));
			System.out.println();
		} else {
			System.err.println("The update method is invalid");
		}
	}

	public int indexOccupied() {
		System.out.println("Invoked Index Occupied ");
		return this.kachori;
		// TODO Auto-generated method stub

	}

	public boolean matchCircus(String duration) {
		System.out.println("Invoked the matching");

		for (int i = 0; i < circusDTOs.length; i++) {
			CircusDTO ref = this.circusDTOs[i];

			if (ref != null) {
				System.out.println("The ref is not null at index : ".concat(String.valueOf(i)));

				String tempname = ref.getDuration();
				System.out.println("The duration of the show is ".concat(tempname));

				if (duration.equals(tempname)) {
					System.out.println("Circus found");
					return true;
				}
			}
		}
		System.out.println("Duration not found");
		return false;
	}

}
