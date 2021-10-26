package com.xworkz.crud.operators;

public class Labour {

	private String[] labourWork=new String[7];
    private int godzilla=0;
    
    public  void addWork(String name) {
  	  System.out.println("Labour Work:"+name);
  	  System.out.println("Godzilla:".concat(String.valueOf(this.godzilla)));
  	  if(godzilla<labourWork.length) {
  		   this.labourWork[this.godzilla++]=name;
  	  }
  	  else {
  		  System.err.println("Array is Full");
  	  }
	}
    public void displayWork() {
  	  for(int i=0;i<labourWork.length;i++) {
  		  System.out.println("Displayed Work:".concat(String.valueOf(this.labourWork[i])));
  	  }
    }
    public void deleteReference(int index) {
  		
		if (index >= 0 && index <=labourWork.length) {
			this.labourWork[index] = null;
			System.out.println("Deleting the Reference:".concat(String.valueOf(this.labourWork)));

		} else {
			System.err.println("index is deleted:".concat(String.valueOf(this.godzilla)));
		}

	}
	public void UpdateWork(int index, String nothing) {
		if (index>= 0 && index < labourWork.length && nothing!=null) {
			this.labourWork[index]=nothing;
System.out.println("Updating Work:".concat(String.valueOf(index)));

		}
		else {
			System.err.println("canoot be updated:");
		}
	}
}
