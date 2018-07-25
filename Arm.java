//to check whether a no. is armstrong or not

import java.util.*;
class Arm
{
  public static void main(String arg[])
  {
  int a,n,s=0,r=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any number");
  a=sc.nextInt();
  n=a;
  while(n>0)
    {
     r=n%10;
     s=s+(r*r*r);
     n=n/10;
    }
  if(s==a)
    {
    System.out.println(a+ "is an armstrong no");
    }
  else
    {
    System.out.println(a+ " is not an armstrong no");
    }
  }
}