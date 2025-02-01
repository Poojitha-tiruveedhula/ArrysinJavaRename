import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
public class StreamAPI
{
public static void main(String[] args)
{
int i;
List<Integer>a=Arrays.asList(3,5,1,2,8);
//for(i=0;i<a.size();i++)      //normal for loop
//{
//System.out.println(a.get(i));
//}

//for(int m:a)               //for each method
//{
//System.out.println(m);
//}
//for each method
a.forEach(n->System.out.println(n));
//int sum=0;
//for(int b:a)
//{
//if(b%2==0)
//{
//b=b*2;
//sum=sum+b;
//}}
//System.out.println(sum);
}}
