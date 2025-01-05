//@FunctionalInterface
interface A
{
 void show(int a);
}
public class LambdaExpressions
{
public static void main(String[] args)
{
A obj=a-> System.out.println("in a class show method  "+  a);
obj.show(2);
}
}