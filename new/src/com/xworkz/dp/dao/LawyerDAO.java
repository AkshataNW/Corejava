package com.xworkz.dp.dao;

import java.util.Iterator;

import com.xworkz.dp.dto.LawyerDTO;

public class LawyerDAO {

	private LawyerDTO[] lawyerDTOs = new LawyerDTO[10];
	private int count;

	public LawyerDAO() {
		System.out.println("Invoked LawyerDAO no-arg constructor");
	}

	public void save(LawyerDTO dto) {
		System.out.println();
		System.out.println("Invoked save method");
		if (this.count < this.lawyerDTOs.length && dto != null) {
			this.lawyerDTOs[this.count++] = dto;
			System.out.println("The name of the court is ".concat(dto.getCourttype()));
		} else {
			System.err.println("The save method is invalid");
			System.out.println();
		}

	}

	public void delete(int index) {
		System.out.println("Get up delete");
		if (index < this.lawyerDTOs.length) {
			this.lawyerDTOs[index] = null;
			System.out.println("The index is deleted at ".concat(String.valueOf(index)));
			System.out.println();
		}
	}

	public LawyerDTO[] getLawyerDTOs() {
		return lawyerDTOs;
	}

	public boolean searchByName(String name) {
		System.out.println("Invoked search by name");
		System.out.println();
		for (int i = 0; i < lawyerDTOs.length;) {
			LawyerDTO ref = lawyerDTOs[i];

			if (ref != null && name != null) {
				System.out.println("The index is not pointing to null");

				String cname = ref.getName();
				System.out.println("Matching ".concat(cname));
				if (cname.equals(name)) {
					System.out.println("Lawyer name found at index ".concat(String.valueOf(i)));
					System.out.println();
					return true;
				} else {

					System.out.println("Lawyer name not found");
					System.out.println();

				}
			}
			i++;
		}
		return false;
	}

	public boolean searchCasesWon(int won) {
		System.out.println("Invoked  matching searchcases won");
		System.out.println();
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO win = lawyerDTOs[i];
			if (win != null) {
				System.out.println("Index is not pointing to null");

				int wewon = win.getCaseswon();
				System.out.println("Matching " + wewon + " with " + won
						+ " and the obtained value is ".concat(String.valueOf(wewon == won)));
				if (wewon == won) {
					System.out.println("Matching obtained at index ".concat(String.valueOf(i)));
					return true;
				}

				else {
					System.out.println("Matching not found");
					System.out.println();
				}
			}
		}
		return false;
	}

	public void save(LawyerDTO dto, int index) {
		System.out.println("Invoked save method overload");
		if (index >= 0 && index < this.lawyerDTOs.length && dto != null) {
			this.lawyerDTOs[index] = dto;
			System.out.println("The name is " + dto.getName() + " at the index " + index);
			this.count++;
			System.out.println();
		} else {
			System.err.println("The save method is invalid");
			System.out.println();
		}

	}

	public String getQualificationbyname(String name) {
		System.out.println("Invoked qualification by name");
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref = lawyerDTOs[i];
			if (ref != null) {
				System.out.println("The index is not pointing to null");
				String kachori = ref.getName();
				if (name.equals(kachori)) {
					System.out.println("Name found ");
					String qualification = ref.getQualification();
					System.out.println(qualification);
					return ref.getQualification();
				} else {
					System.out.println("Name not found");
					System.out.println();
				}
			}
		}
		return null;
	}

	public int getExpByName(String name) {
		System.out.println();
		System.out.println("Invoked Experience by name");
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO ref = lawyerDTOs[i];
			if (ref != null) {
				System.out.println("reference is not pointing to null");
				String cname = ref.getName();
				System.out.println("Matching ".concat(cname));
				if (cname.equals(name)) {
					System.out.println("Name found");
					// int experience=ref.getExperience();
					// System.out.println(experience);
					return ref.getExperience();
				} else {
					System.out.println("Name not found");
				}
			}

		}
		return 0;

	}

	public LawyerDTO getLawyerWithMaxExp() {
		System.out.println("Invoked lawyer with maximum experience");
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO lawyerDTO = lawyerDTOs[i];
			if (lawyerDTO != null) {
				int compare = lawyerDTO.getExperience();
				System.out.println(compare);
				if (compare > count) {
					count = compare;
					System.out.println("The maximum experience is : ".concat(String.valueOf(count)));
					this.count++;
				}
			}

		}

		return null;

	}
}
