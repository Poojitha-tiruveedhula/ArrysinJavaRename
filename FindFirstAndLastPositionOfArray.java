import java.util.*;
import java.util.Scanner;
public class FindFirstAndLastPositionOfArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] nums=new int[a];
for(int i=0;i<a;i++)
{
nums[i]=sc.nextInt();
}
int target=sc.nextInt();
int[] result=searchRange(nums,target);
System.out.println(result[0]+" "+result[1]);
}
public static int[] searchRange(int[] nums,int target)
{
int[] arr=new int[2];
arr[0]=arr[1]=-1;
for(int i=0;i<nums.length;i++)
{
if(nums[i]==target)
{
arr[0]=i;

while(i<nums.length-1 && nums[i+1]==target)
{
i++;}
arr[1]=i;
break;
}}
return arr;
}
}









