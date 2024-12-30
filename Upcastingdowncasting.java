class A
{
public void display()
{
System.out.println("A hello");
}
}

class B extends A 
{
public void display1()
{
System.out.println("B hello");
}
}


public class Upcastingdowncasting
{
public static void main(String[] args)
{
A obj=new B();
obj.display();
B obj1=(B)obj;
obj1.display1();
}
}


