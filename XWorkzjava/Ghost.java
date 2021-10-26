class Ghost{
public void Ghost(){
System.out.println("This is the default constructor");
}
public void Ghost(String name)
{
System.out.println("This is parameter constructor"+name);
}
public static void main(String args[]){
Ghost obj1=new Ghost();
obj1.Ghost();
obj1.Ghost("yakshini");
}
}
