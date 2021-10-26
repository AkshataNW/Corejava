package com.xworkz.dp.dto;

public class iplDTO {
	
	private String teamName;
	private int noOfTeams;
	private int noOfPlayers;
	private String owner;
	private String sponsor;
	
	public iplDTO() {
		System.out.println("Invoked iplDTO no-arg constructor");
	}

	public iplDTO(String teamName, int noOfTeams, int noOfPlayers, String owner, String sponsor) {
		super();
		this.teamName = teamName;
		this.noOfTeams = noOfTeams;
		this.noOfPlayers = noOfPlayers;
		this.owner = owner;
		this.sponsor = sponsor;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNoOfTeams() {
		return noOfTeams;
	}

	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	

}
