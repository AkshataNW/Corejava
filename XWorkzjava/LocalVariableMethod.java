class LocalVariableMethod{
static String Name= "Global";
public static void main(String args[]){
String name1="Local";
System.out.println("This is local Variable" +name1);
System.out.println("this is global variable we can access it =" +Name);
second();
}
static void second(){
String name2="Second Local";
System.out.println("This is second method");
System.out.println("This is another method local variable"+name2);
System.out.println("Thnais is the global variable we can access it =="+Name);
}
}