import java.io.IOException;
class A extends Thread
{
public void run()
{
for(int i=0;i<60;i++)
{
System.out.println("a class");
try
{
Thread.sleep(20);
}
catch(InterruptedException e)
{
//e.PrintStackTrace();
}
}
}
}
class B extends Thread
{
public void run()
{
for(int i=0;i<60;i++)
{
System.out.println("b class");
try
{
Thread.sleep(20);
}
catch(InterruptedException e)
{
//e.PrintStackTrace();
}
}
}
}
public class ThreadSleep
{
public static void main(String[] args) throws IOException
{
A obj1=new A();
B obj2=new B();
obj1.start();
try
{
Thread.sleep(5);
}
catch(InterruptedException e)
{
//e.PrintStackTrace();
}
obj2.start();
}
}

