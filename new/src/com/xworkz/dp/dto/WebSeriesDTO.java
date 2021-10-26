package com.xworkz.dp.dto;

import com.xworkz.dp.constants.*;

public class WebSeriesDTO {
	
	private Genre genre;
	private String name;
	private int noOfCharacters;
	private int noOfSeasons;
	private float ratings;
	private int currentSeason;
	private String cast;
	
	public WebSeriesDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("Invoked no-arg constructor");
	}

	public WebSeriesDTO(Genre genre, String name, int noOfCharacters, int noOfSeasons, float ratings, int currentSeason,
			String cast) {
		super();
		this.genre = genre;
		this.name = name;
		this.noOfCharacters = noOfCharacters;
		this.noOfSeasons = noOfSeasons;
		this.ratings = ratings;
		this.currentSeason = currentSeason;
		this.cast = cast;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfCharacters() {
		return noOfCharacters;
	}

	public void setNoOfCharacters(int noOfCharacters) {
		this.noOfCharacters = noOfCharacters;
	}

	public int getNoOfSeasons() {
		return noOfSeasons;
	}

	public void setNoOfSeasons(int noOfSeasons) {
		this.noOfSeasons = noOfSeasons;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(int currentSeason) {
		this.currentSeason = currentSeason;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}
}
