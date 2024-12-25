class M
{
public int multi(int n1, int n2)
{
return n1*n2;
}
}
class N extends M
{
public int multi(int n1,int n2)
{
return n1*n2+1;
}
}
public class Methodoverriding
{
public static void main(String[] args)
{
N obj=new N();
int a=obj.multi(2,3);
System.out.println(a);
}
}