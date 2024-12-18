class Stringbuffer
{
public static void main(String[] args)
{
StringBuffer s=new StringBuffer("arya");
System.out.println(s.capacity());
System.out.println(s.length());
System.out.println(s.append(" kapoor"));
System.out.println(s.deleteCharAt(3));
System.out.println(s.substring(0,1));
}
}