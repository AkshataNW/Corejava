package com.xworkz.dp.dto;

public class TimerDTO {
	
	private boolean working;
	private boolean correctTime;
	private boolean digital;
	private boolean bell;
	private String barnd;
	
	public TimerDTO() {
		// TODO Auto-generated constructor stub
		System.out.println();
	}

	public TimerDTO(boolean working, boolean correctTime, boolean digital, boolean bell, String barnd) {
		super();
		this.working = working;
		this.correctTime = correctTime;
		this.digital = digital;
		this.bell = bell;
		this.barnd = barnd;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public boolean isCorrectTime() {
		return correctTime;
	}

	public void setCorrectTime(boolean correctTime) {
		this.correctTime = correctTime;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

	public String getBarnd() {
		return barnd;
	}

	public void setBarnd(String barnd) {
		this.barnd = barnd;
	}
	
	

}
