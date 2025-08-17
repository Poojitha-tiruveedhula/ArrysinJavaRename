class Animals
{
void run()
{
System.out.println("running");
}
}
class Birds extends Animals
{
void run()
{
System.out.println("flying");
}
}
public class OverRidingInOops
{
public static void main(String[] args)
{
Birds a=new Birds();
a.run();
}
}