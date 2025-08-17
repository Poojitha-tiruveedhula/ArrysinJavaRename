class Bird
{
void fly()
{
System.out.println("make fly");
}
}
class Peacock extends Bird
{
void dance()
{
System.out.println("make dance");
}
}
public class InheritanceInOops
{
public static void main(String[] args)
{
Peacock c=new Peacock();
c.dance();
c.fly();
}
}