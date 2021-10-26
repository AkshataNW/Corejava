class Plane{
static String src_name="Hubli";
static String Des_name="Qatar";
static double Tick_price=15000.00d;
static void planeName(){
String planeName="INDIGO";
System.out.println("The plane name is "+planeName);
}
static void classes(){
String class1="VIP";
String class2="Economic";
System.out.println("The first class is "+class1);
System.out.println("The second class is "+class2);
}
static void food(){
boolean food=true;
System.out.println("The food here is good "+food);
}
public static void main(String args[])
{
System.out.println("The source is "+src_name);
System.out.println("The destination is "+Des_name);
System.out.println("The Ticket price is "+Tick_price);
planeName();
classes();
food();
}
}
