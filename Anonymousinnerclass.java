class A
{
public void display()
{
System.out.println("in your class");
}
}
class B extends A
{
public void display()
{
System.out.println("in my class");
}
}
class Anonymousinnerclass
{
public static void main(String[] args)
{
A obj=new B()
{
public void display()
{
System.out.println("in our class");
}
};
obj.display();
}
}
