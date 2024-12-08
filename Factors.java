import java.util.Scanner;
public class Factors
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a  number: ");
int y=sc.nextInt();
System.out.println("factors are: ");
for(int x=1; x<=y; x++)
{
if(y%x==0)
{
System.out.println(x);
}
}
sc.close();
}
}

