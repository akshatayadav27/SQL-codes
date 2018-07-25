// to find out facorial of any number
import java.util.*;
class Factorial
{
  public static void main(String arg[])
  {
  int n,i,fact=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any number");
  n=sc.nextInt();
  for(i=n;i>0;i--)
    {
     fact=fact*i;
    }
  System.out.println(fact+ "is the required factorial of the number");
  }
}