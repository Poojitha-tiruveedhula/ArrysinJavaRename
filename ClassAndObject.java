class Cycle
{
String brand;
Cycle(String c)
{
brand=c;
}
void show()
{
System.out.println("show:"+brand);
}}
public class ClassAndObject
{
public static void main(String[] args)
{
Cycle c1=new Cycle("Hercules");
Cycle c2=new Cycle("hero");
c1.show();
c2.show();
}
}
