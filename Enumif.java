enum Status
{
Pending, Running, Failed, Success;
}
public class Enumif
{
public static void main(String[] args)
{
Status s=Status.Pending;
if(s==Status.Success)
System.out.println("wait");
else if(s==Status.Running)
System.out.println("processing");
else if(s==Status.Failed)
System.out.println("try again");
else
System.out.println("ok done");
}
}
