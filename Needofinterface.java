interface Computer
{
 void code();

}
class Laptop implements Computer
{
public void code()
{
System.out.println("code,run");
}
}
class Desktop implements Computer
{
public void code()
{
System.out.println("code,run,fast");
}
}
class Software
{
public void devapp(Computer lap)
{
lap.code();
}
}
public class NeedofInterface
{
public static void main(String[] args)
{
Computer lap=new Laptop();
Computer desk=new Desktop();
Software hi=new Software();

hi.devapp(lap);
}
}
