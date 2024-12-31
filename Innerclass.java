class Outer
{
int a;
public void show()
{
System.out.println("a class");
}
static class Inner
{
public void display()
{
System.out.println("b class");
}
}
}
public class Innerclass
{
public static void main(String[] args)
{
Outer c=new Outer();
c.show();
Outer.Inner d= new Outer.Inner();
d.display();
}
}