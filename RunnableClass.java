import java.io.IOException;
class M
{
}
class A implements Runnable
{
public void run()
{
for(int i=1;i<=4;i++)
{
System.out.println("a class");
try
{
Thread.sleep(20);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
}
class B implements Runnable
{
public void run()
{
for(int i=1;i<=4;i++)
{
System.out.println("b class");
try
{
Thread.sleep(20);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
}

public class RunnableClass
{
public static void main(String[] args) throws IOException
{
Runnable obj1=() ->
{
for(int i=1;i<=4;i++)
{
System.out.println("a class");
try
{
Thread.sleep(10);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}};

Runnable obj2=()->
{
for(int i=1;i<=4;i++)
{
System.out.println("b class");
try
{
Thread.sleep(10);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}};

Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);
t1.start();
t2.start();
}
}

