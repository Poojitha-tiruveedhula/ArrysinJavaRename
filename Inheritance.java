class Demo
{
public int add(int n1,int n2)
{
return n1+n2;
}
public int sub(int n1,int n2)
{
return n1-n2;
}
}
 class Example extends Demo
{
public int multi(int n1,int n2)
{
return n1*n2;
}
public int div(int n1,int n2)
{
return n1/n2;
}
}
public class Inheritance
{
public static void main(String[] args)
{
Demo obj=new Demo();
Example obj1=new Example();
int a=obj1.add(4,3);
int b=obj1.sub(5,4);
int c=obj1.multi(2,3);
int d=obj1.div(4,2);
System.out.println(a+" "+b+" "+c+" "+d);
}
}
