class Hi
{
String company;
int cost;
static String name;

public void display()
{
System.out.println(company+":"+cost+":"+name);
}

public static void display1(Hi obj)
{
System.out.println(obj.company+":"+obj.cost+":"+obj.name);
}
}

public class Staticmethod
{
public static void main(String[] args)
{
Hi obj1=new Hi();
obj1.company="redmi";
obj1.cost=20000;
Hi.name="phone";

Hi obj2=new Hi();
obj2.company="realme";
obj2.cost=22000;
Hi.name="phone";

Hi obj3=new Hi();
obj3.company="poco";
obj3.cost=18000;
Hi.name="phone";
obj2.name="cell";

obj1.display();
obj2.display();
obj3.display();
Hi.display1(obj1);
}
}

