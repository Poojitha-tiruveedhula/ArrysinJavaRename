import java.util.Scanner;
class Vowelconsonant
{
public static void main(String[] args)
{
System.out.println("enter a alphabet:");
Scanner sc=new Scanner(System.in);
char x=sc.next().charAt(0);
if(x == 'a'|| x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A'|| x == 'E' || x == 'I' || x == 'O' || x == 'U')
{
System.out.println("vowels");
}
else
{
System.out.println("consonants");
}
}
}