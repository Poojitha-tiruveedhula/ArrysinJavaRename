class Throw
{
 public static void main(String []args)
{
int a=0;
int b=3;
try
{
b=b/a;
if(a==0)
throw new ArithmeticException("a should not be zero");    
  }
catch(ArithmeticException e)
{
b=3/1;
System.out.println("Exception caught: "+e);
}
System.out.println(b);

System.out.println("wrong");
}
}
