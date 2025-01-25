import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class BufferedReaderAndScanner
{
public static void main(String[] args) throws Exception
{
System.out.println("Enter a number:");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.println(num);
}
}
