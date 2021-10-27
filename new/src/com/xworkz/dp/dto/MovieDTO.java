package com.xworkz.dp.dto;

public class MovieDTO {

	private String name;
	private String director;
	private String actor;
	private String rating;
	private String producer;
	
	public MovieDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("Invoked no-arg constructor");
	}

	public MovieDTO(String name, String director, String actor, String rating, String producer) {
		super();
		this.name = name;
		this.director = director;
		this.actor = actor;
		this.rating = rating;
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
}
