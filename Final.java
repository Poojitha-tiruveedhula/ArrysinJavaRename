class A
{
public final void show()
{
System.out.println("a class");
}
public void add(int a,int b)
{
System.out.println(a+b);

}
}
class B extends A
{
public void show()
{
System.out.println("b class");
}
}
class Final
{
public static void main(String[] args)
{
A obj=new B();
obj.show();
obj.add(2,3);
}
} 