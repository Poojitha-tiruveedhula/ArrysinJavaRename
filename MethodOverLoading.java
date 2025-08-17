 class Polymorphism
{
 int add(int a,int b){
return a+b;
}
float add(float a,float b){
return a+b;
}
String add(String a)
{
return a;
}
int add(int a,int b,int c)
{
return a+b+c;
}
}
public class MethodOverLoading
{
public static void main(String[] args)
{
Polymorphism p=new Polymorphism();
System.out.println(p.add(2,3));
System.out.println(p.add(4f,5f));
System.out.println(p.add("hello"));
System.out.println(p.add(3,4,5));
}
}

