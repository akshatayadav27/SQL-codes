//to check whether a no. is prime or not

import java.util.*;
class Prime_no
{
   public static void main(String arg[])
   {
   int i,n,count=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter any number");
   n=sc.nextInt();
   for(i=1;i<=n;i++)
    { 
      if(n%i==0)
      {
       count++;   
      }
    }
      if(count==2)
      {
       System.out.println(n+ ":is a prime no.");
      }
      else 
      {
      System.out.println(n+ ": is not a prime no.");
      } 
    }
   
}
