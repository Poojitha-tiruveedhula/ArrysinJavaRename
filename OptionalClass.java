import java.util.*;
import java.util.Scanner;
public class OptionalClass
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
Optional<String>opt=s.isEmpty() ? Optional.empty():Optional.of(s);
opt.ifPresentOrElse
(
name->System.out.println("helo:"+s),
()->System.out.println("empty")
);
}
}