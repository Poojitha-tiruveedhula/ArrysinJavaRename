class Berlin
{
public void playgame()
{
System.out.println("playing game");
}
public String getball(int cost)
{
return "ball";
}
}
public class MethodAccessing
{
public static void main(String[] args)
{
Berlin obj=new Berlin();
obj.playgame();
String str=obj.getball(10);
System.out.println(str);
}
}


