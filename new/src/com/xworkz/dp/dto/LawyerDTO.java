package com.xworkz.dp.dto;

public class LawyerDTO {

	private String name;
	private String qualification;
	private int experience;
	private String gender;
	private int age;
	private String courtType;
	private int casesWon;
	private int casesLost;

	public LawyerDTO() {
		System.out.println("Invoked Lawyer DTO no-arg constructor");
	}

	public LawyerDTO(String name, String qualification, int experience, String gender, int age, String courttype,
			int caseswon, int caseslost) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
		this.courtType = courttype;
		this.casesWon = caseswon;
		this.casesLost = caseslost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourttype() {
		return courtType;
	}

	public void setCourttype(String courttype) {
		this.courtType = courttype;
	}

	public int getCaseswon() {
		return casesWon;
	}

	public void setCaseswon(int caseswon) {
		this.casesWon = caseswon;
	}

	public int getCaseslost() {
		return casesLost;
	}

	public void setCaseslost(int caseslost) {
		this.casesLost = caseslost;
	}

}
