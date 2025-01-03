enum Status
{
Pending, Running, Failed, Success, Danger;
}
public class Enum
{
public static void main(String[] args)
{
Status[] ss=Status.values();
System.out.println(ss);
for (Status s:ss)
{
//System.out.println(s);
System.out.println(s+":"+s.ordinal());
}
}
}