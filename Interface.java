interface A
{
String name="priya";
int marks=100;
void display();
void run();
}
class B implements A
{
public void display()
{
System.out.println("display");
}
public void run()
{
System.out.println("running");
}
}
class Interface
{
public static void main(String[] args)
{
A obj;
obj=new B();
obj.display();
obj.run();
System.out.println(A.name);
System.out.println(A.marks);
}
}
