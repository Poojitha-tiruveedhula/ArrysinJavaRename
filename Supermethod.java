class P
{
public P()
{
super();
System.out.println("p");
}
public P(int n)
{
super();
System.out.println("int p");
}
}
class X extends P
{
public X()
{
super();
System.out.println("x");
}
public X(int x)
{
super(x);
System.out.println("int x");
}
}
public class Supermethod
{
public static void main(String[] args)
{
X obj=new X(1);
}
}
