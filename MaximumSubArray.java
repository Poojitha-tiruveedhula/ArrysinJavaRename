import java.util.*;
import java.util.Scanner;
public class MaximumSubArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int nums[]=new int[a];
for(int i=0;i<a;i++)
{
nums[i]=sc.nextInt();
}
System.out.println(maxsubarray(nums));
}
public static int maxsubarray(int[] nums)
{
int maxSum=Integer.MIN_VALUE;
int currentSum=0;
for(int i=0;i<nums.length;i++)
{
currentSum+=nums[i];
if(currentSum>maxSum)
{
maxSum=currentSum;
}
if(currentSum<0)
{
currentSum=0;
}
}
return maxSum;
}
}