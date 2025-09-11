import java.util.*;
import java.util.Scanner;
public class BinarySearchWithoutSorting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res=binarySearch(b,target);
      if(res>=0)
      {
          System.out.println(res);
      }
      else{
          System.out.println("no");
      }}
      public static int binarySearch(int[] b,int target)
      {
          for(int i=0;i<b.length;i++)
          {
              if(b[i]==target)
              {
                  return i;
              }}
              return -1;
          
      }
    }
