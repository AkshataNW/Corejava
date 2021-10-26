package com.xworkz.crud.operators;

public class Stadium {

	private String[] stadiumNames = new String[5];
	private int hello = 0;

	public void addStadiumName(String name) {
		System.out.println("Name arg : ".concat(name));

		if (this.hello < 5) {
			System.out.println("hello ".concat(String.valueOf(hello)));
			this.stadiumNames[this.hello++] = name;
		} else {
			System.err.println("Stadium is full");
		}
	}

	public void displayStadiumNames() {
		for (int i = 0; i < stadiumNames.length; i++) {
			System.out.println(stadiumNames[i]);
		}
	}

	public void deleteStadiumName(int hi) {
		if (hi >= 0 && hi < stadiumNames.length) {
			stadiumNames[hi] = null;
		} else {
			System.err.println("Stadium size invalid");
		}
	}

	public void updateStadiumName(int index, String updateName) {
		if (index >= 0 && index < stadiumNames.length && updateName != null) {
			stadiumNames[index] = updateName;
		} else {
			System.err.println(" Stadium size is invalid and name should not be Null");
		}
	}

}

