package com.xworkz.dp.dto;

public class DoctorDTO {
	
	private String name;
	private String specialization;
	private String hospitalname;
	private String gender;
	private int age;
	
	public DoctorDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("Invoked No-arg constructor");
	}

	public DoctorDTO(String name, String specialization, String hospitalname, String gender, int age) {
		super();
		this.name = name;
		this.specialization = specialization;
		this.hospitalname = hospitalname;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
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
}
