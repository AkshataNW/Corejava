class Entertainment{

String name,own,GST,loc,mrat;
int shows,sts,scrn;
boolean park;
float rat;

void movie(){
name="3 Idiots";
own="Akshata";
GST="2KA17EE002";
loc="BTM";
shows=4;
sts=50;
scrn=6;
park=true;
rat=98.58f;
mrat="4.5 Star";
System.out.println("The movie name is: "+name);
System.out.println("The owner is: "+own);
System.out.println("It is located in: "+loc);
System.out.println("The GSTno  is: "+GST);
System.out.println("The number of shows are: "+shows);
System.out.println("The number of seats are: "+sts);
System.out.println("The number of screens are: "+scrn);
System.out.println("Avalability of parking: "+park);
System.out.println("The movie rating is: "+rat);
System.out.println("The Theatre rating is: "+mrat);
}


void timing(){
String t1="9:00AM-12:00AM";
String t2="12:00AM-3:00PM";
String t3="3:00PM-6:00PM";
String t4="6:00PM-9:00PM";
System.out.println("The show timings are as follows: ");
System.out.println(t1+" "+t2+" "+t3+" "+t4);
}

public static void main(String args[]){
Entertainment obj=new Entertainment();
System.out.println("Welcome!!!!");
obj.movie();
obj.timing();
System.out.println("Thankyou come agian :) :)");
}
}




