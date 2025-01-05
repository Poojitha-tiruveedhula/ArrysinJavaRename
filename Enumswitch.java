enum Status
{
Pending, Running, Failed, Success;
}
public class Enumswitch
{
public static void main(String[] args)
{
Status s=Status.Pending;
switch(s)
{
case Running:
System.out.println("processing");
break;
case Pending:
System.out.println("wait");
break;
case Failed:
System.out.println("try again");
break;
default:
System.out.println("ok done");
}
}
}
