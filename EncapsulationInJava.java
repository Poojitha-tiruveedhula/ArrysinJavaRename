class Bike
{
String name;
public void  setName(String n)
{
name=n;
}
public String  getName()
{
return name;
}
}
public class EncapsulationInJava
{
public static void main(String[] args)
{
Bike b=new Bike();
b.setName("helo");
System.out.println(b.getName());
}
}