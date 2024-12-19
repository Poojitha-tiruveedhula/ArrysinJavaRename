class Hello
{
String company;
int price;
static String name;

static
{
 name="cell";
System.out.println("hello constructor");
}
public Hello()
{
company="";
price=12000;

}
public void show()
{
}
}
public class Staticblock
{
public static void main(String[] args)throws ClassNotFoundException
{
Class.forName("Hello");
}
}
