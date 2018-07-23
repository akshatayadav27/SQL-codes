
// to find greatest_of_three numbers
import java.util.*;
class Greatestofthree
{
 public static void main(String arg[])
 {
 int a,b,c;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter three numbers");
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
    if(a>b&&a>c)
    {
    System.out.println("greatest number : "+a);
    }
    else if(b>a&&b>c)
    {
    System.out.println("greatest number :"+b);
    } 
    else
    {
    System.out.println("greatest number :"+c);
    }
 }

}