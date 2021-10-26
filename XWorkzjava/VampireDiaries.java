class VampireDiaries{
void VampireDiaries(){
System.out.println("Stefan and caroline");
}
void VampireDiaries(String name){
System.out.println("Damon and Stefan " +name);
}

public static void main(String args[])
{
VampireDiaries a = new VampireDiaries();
a.VampireDiaries();
a.VampireDiaries("Salvatore Brothers");
}
}