abstract class A
{
public abstract void display();
}
public class AbstractAnonymousinnerclass
{
public static void main(String[] args)
{
A obj=new A()
{
public void display()
{
System.out.println("a is displayed");
}
};
obj.display();
}
}