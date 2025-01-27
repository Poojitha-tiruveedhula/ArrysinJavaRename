import java.util.*;
class UsingParseInt 
{
public static void main(String args[])
{
int num, ans;
String temp;
num = 1010;
temp = String.valueOf(num);
ans = Integer.parseInt(temp, 2);
System.out.println("Decimal Equivalent of " + num + " is " + ans);
}
}