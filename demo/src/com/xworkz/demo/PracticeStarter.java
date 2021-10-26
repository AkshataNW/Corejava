package com.xworkz.demo;

public class PracticeStarter {
	
  public static void main(String[] args) {
	  
	  String name="Akshata";
	  int result=name.codePointAt(3);
	  System.out.println(result);
	  
	  String s1="java";
	  String s2="javascript";
	  int last=s1.compareTo(s2);
	  System.out.println(last);
	  
	  String firstval="Akshata";
	  String secondval="akshataw";
	  int result1=firstval.compareToIgnoreCase(secondval);
	  System.out.println(result1);
	  
	 int name1=4;
	 String x=String.valueOf(name1);
	 System.out.println(x);
	 
	 String a="akshata";
	 System.out.println(a.endsWith("t"));

	 String ss1="123";
	 String ss2="";
	 System.out.println(ss2.isEmpty());
	 
	 String y=" Soubhagya  ";
	 System.out.println(y.trim()+"123");
	 System.out.println(y+"123");
	 
	 String t="java";
	 s1=t.concat(" is a programming languag");
	 System.out.println(s1);
	 
	 String nm="Hubli";
	 String nme="hubli";
	 System.out.println(nm.equals(nme));//Content is same but change in cases
	 System.out.println(nm.equalsIgnoreCase(nme));//content is same and cases are ignored
	 
	 String op="THE WeathER iS CoLd";
	 String name2="Its Raining";
	 System.out.println(op.toLowerCase());
	 System.out.println(op.toUpperCase());
	 System.out.println(op.length());
	 System.out.println(op.replace("L", "o"));
	 
	 String trainNo="02845";
	 trainNo=trainNo.concat("This is number");
	 System.out.println(trainNo);
	 String trainNo1="0456";
	 trainNo=trainNo1.concat("This is another number");
	 System.out.println(trainNo);
	 System.out.println(trainNo1+null);
	 String max=null;
	 System.out.println(max);
	 
	 
	 String hospital=new String("Fortis");
	 hospital=hospital.toUpperCase();
	 System.out.println(hospital);
	 String kidney=hospital.toLowerCase();
	 System.out.println(kidney);
	 String hospital1=new String("Fortis");
	 hospital1=hospital1.toLowerCase();
	 System.out.println(hospital1);
	 if(hospital==hospital1) {
		 System.out.println("both hospital and hospital1 are pointing to same memeory");
	 }
	 else {
		 System.out.println("both hospital and hospital1 are pointing to different memeory");
	 }
	 
	 String medicine=new String("Dolo 65");
	 String instancemedicine=new String("Dolo 65");
	 if (medicine==instancemedicine) {
		 System.out.println("Both medicine and instancemedicine are pointing to same memory");
		 
	 }
	 else {
		 System.out.println("Both medicine and instancemedicine are pointing to different memory");
	 }
	 
	 medicine="45";
	 boolean equal=medicine.equals(null);
	 System.out.println(equal);
	 medicine=medicine.toUpperCase();
	 System.out.println(medicine);
	 
	  //
	 //
	 //
	 String noise="Noise";
	 String boat=new String("boat");
	 if(noise==boat) {
		 System.out.println("both noise and boat are pointing to same memory");
	 }
	 else {
		 System.out.println("both noise and boat are pointing to different memory");
	 }
	 
	   String boat1="Boat";
	   
	   if(boat==boat1)
	   {
		   System.out.println("both boat1 and boat are pointing to same memory");
		 }
		 else {
			 System.out.println("both boat1 and boat are pointing to different memory");
		 } 
	   
	   String fruit="Cherry";
	   System.out.println(fruit);
	   
	   String fruit1="Mango";
	   System.out.println(fruit1);
	   
	   if(fruit==fruit1) {
		   
		   System.out.println("fruit amd fruit 1 are pointing to same memory");
	   }
	   else {
		   System.out.println("ruit amd fruit 1 are pointing to different memory");
	   }
	   
	   
	  // String game=new String("Kho Kho");//pointing to different memory because of different location
	   //String game1=new String("Kho Kho");//this memory is present in instance location
	   
  String game="Kho Kho";//pointing to same memory because theses are literals pointing to the constant pool
  
  String game1="Kho Kho";//in the same  memory
  
  
  
  
  if(game==game1) {
	  System.out.println("game and game1 are pointing to same memory");
 
}
  else {
	  System.out.println("ame and game1 are pointing to differen memory");
  }
  
 }

}




