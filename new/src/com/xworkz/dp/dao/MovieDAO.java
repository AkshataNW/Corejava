package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MovieDTO;
import com.xworkz.dp.dto.TimerDTO;

public class MovieDAO {

	private MovieDTO[] movieDTOs=new MovieDTO[10];
	private int count;
	
	public void create(MovieDTO dto) {
		System.out.println("Invoked Create method");
		if(this.count<this.movieDTOs.length && dto!=null)
		{
			this.movieDTOs[this.count++]=dto;
			System.out.println("The name is : ".concat(dto.getActor()));
			System.out.println();
		}
		else {
			System.out.println("Create method is invalid");
		}
	}
	
	public void create(MovieDTO dto,int fan) {
		// TODO Auto-generated method stub
		if(fan>=0 && fan<this.movieDTOs.length && dto!=null) {
			this.movieDTOs[fan]=dto;
			System.out.println("The create overload invoked movie name ".concat(String.valueOf(dto.getName())));
			this.count++;
			System.out.println();
		}
		else
		{
			System.err.println("Create overload is invalid");
		}
		}
	
	public int indexOccupied() {
		// TODO Auto-generated method stub
		return this.count;
		
	}
	public boolean matchname(String name) {
		System.out.println("Invoked the matching");

		for (int i = 0; i < movieDTOs.length; i++) {
			MovieDTO ref = this.movieDTOs[i];

			if (ref != null) {
				System.out.println("The ref is not null at index : ".concat(String.valueOf(i)));

				String tempname = ref.getName();
				System.out.println("The  Movie is ".concat(tempname));

				if (name.equals(tempname)) {
					System.out.println("name found");
					return true;
				}
			}
		}
		System.out.println("name not found");
		return false;
	}

}



