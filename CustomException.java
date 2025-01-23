class ownExceptions extends Exception
{
public ownExceptions(String hello)
{
super(hello);
}
}
public class CustomException 
{
 public static void main(String []args)
{
int a=10;
int b=0;
try
{
b=8/a;
if(b==0)
throw new ownExceptions("should not be zero");    
}
catch(ArithmeticException e)
{
b=8/1;
System.out.println("Exception caught: "+e);
}
catch(Exception e)
{
System.out.println("Exception caught: "+e);
}
System.out.println(b);
System.out.println("wrong");
}
}
