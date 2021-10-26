class ObjectLogin{

int password;
String username;
boolean submit;
 
public void userinfo(){
password=12345;
username="admin@gmail.com";
submit=true;
System.out.println(password +" "+username+" "+submit);
}

public static void main(String args[]){
ObjectLogin obj=new ObjectLogin();
obj.userinfo();
System.out.println(obj.password);//if we donot use static we have to use object(obj)sepratelly calling
System.out.println(obj.username);
}
} 
