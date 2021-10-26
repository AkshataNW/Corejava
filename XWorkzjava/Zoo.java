class Zoo{


public void Zoo(){ 
System.out.println("Welcome to zoo :) :)");
}

public void x(String a, String b,String c,String d,String e){
System.out.println("It is a "+a); 
System.out.println("its D.O.B is "+b);
System.out.println("its D.O.D is "+c);
System.out.println("its weight is "+d);
System.out.println("owner name is "+e);  
}

public void y(String f,String g,String h,String i,String j){
System.out.println("It is a "+f); 
System.out.println("its D.O.B is "+g);
System.out.println("its D.O.D is "+h);
System.out.println("its weight is "+i);
System.out.println("owner name is "+j);  
}

public static void main(String args[]){
Zoo obj=new Zoo();
obj.Zoo();
obj.x("Herbivore","01-01-2019","01-01-2021","98KG","Pooja");
obj.y("Carnivore","23-04-2016","12-09-2021","120KG","purva");
}
}
   
