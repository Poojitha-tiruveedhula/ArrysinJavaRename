//@FunctionalInterface
interface A
{
 int add(int a,int b);
}
public class LambdaExpressionsWithReturn
{
public static void main(String[] args)
{
A obj=(a,b) -> a+b;
int c=obj.add(6,8);
System.out.println(c);
}
}