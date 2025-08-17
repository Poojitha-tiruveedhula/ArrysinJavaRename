import java.util.*;
import java.util.Scanner;
interface Greet
{
void say(String name);
}
public class LambdaExpressionsInJava
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
Greet g=(n)->System.out.println("hello:"+n);
g.say(name);
}
}
