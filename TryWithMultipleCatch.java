public class TryWithMultipleCatch
{
public static void main(String[] args)
{
int a=3;
int b=3;
int c[]=new int[6];
String str=null;
try
{
b=b/a;
System.out.println(str.length());
System.out.println(c[1]);
System.out.println(c[7]);
}
catch(ArithmeticException e)
{
System.out.println("mathematical error");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("array out of bound exception");
}
catch(Exception e)
{
System.out.println("catch error");
}
System.out.println(b);
System.out.println("hello welcome to java");
}
}
