package com.xworkz.crud;

import com.xworkz.crud.operators.Airport;

public class AirportStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Airport airport = new Airport();
		
		
		airport.addAirport("Emirates");
		airport.addAirport("Indian Airways");
		airport.addAirport("Singapore Airlines");
		airport.addAirport("Kingfisher");
		airport.addAirport("Indigo");
		airport.addAirport("pinnacle Air");
		airport.addAirport("vistara");
		airport.addAirport("Deccan Airline");
		airport.delete(5);
		airport.update(2, "Aksh");
		airport.displaydetails();
				

	}

	}


