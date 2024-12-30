class A
{
String brand;
int price;
public String toString()
{

return brand+ ":" +price;
}
public boolean equals(A that)
{
return this.brand.equals(that.brand) && this.price==that.price;
}
}
public class Objectclass
{
public static void main(String[] args)
{
A obj=new A();
obj.brand="asus";
obj.price=100000;
A obj1=new A();
obj1.brand="asus";
obj1.price=100000;
boolean result=obj.equals(obj1);
System.out.println(result);
}
}


