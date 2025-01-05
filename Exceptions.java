public class Exceptions
{
public static void main(String[] args)
{
int a=0;
int b=4;
int c;
try{
b=b/a;
}
catch(Exception e)
{
System.out.println("catch error");
}
System.out.println(b);
}
}
