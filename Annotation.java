class A
{
public void display()
{
System.out.println("in A class");
}
}
class B extends A
{
@Override  //annotation
public void display()
{
System.out.println("in B class");
}
}
class Annotation
{
public static void main(String[] args)
{
B obj=new B();
obj.display();
}
}
