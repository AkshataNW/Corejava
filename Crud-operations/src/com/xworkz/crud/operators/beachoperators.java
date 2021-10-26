package com.xworkz.crud.operators;

public class beachoperators {

	private String country;
	private String[] beachname = new String[5];
	private int counter = 0;

	public beachoperators() {
		this("INDIA");//this statement
		System.out.println("Invoked the no-arg constructor");
	}

	public beachoperators(String country) {
		this.country = country;
		System.out.println("Invoked the beach operator" + country);
	}

	public String getCountry() {
		return country;
	}

	public void addbeachname(String name) {
		System.out.println("Invoked addbeachname");
		System.out.println("Name is ".concat(name));
		if (this.counter < 6) {
			this.beachname[this.counter] = name;
			counter++;
			// beachname[0]=name;
			//this.beachname[counter]=name;
		} else {
			System.out.println("End statement");
		}
	}

	public void displaybeachname() {
		System.out.println("Invoked display details");
		for (int i = 0; i < this.beachname.length; i++) {
			String name = this.beachname[i];
			System.out.println(name);
		}
	}
}
