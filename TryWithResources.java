import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TryWithResources
{
public static void main(String[] args) throws IOException
{
int a=2;
int b=0;
try
{
b=20/0;
}
catch(Exception e)
{
System.out.println("hello");
System.out.println("hi");
}
finally
{
System.out.println("heyy");
}
int number=0;
try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
{
number=Integer.parseInt(br.readLine());
System.out.println(number);
}
finally
{
//br.close();
}
}
}
