
// to find greatest of two numbers
import java.util.*;
class Greatest
{
 public static void main(String arg[])
 {
 int a,b;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter two numbers");
 a=sc.nextInt();
 b=sc.nextInt();
    if(a>b)
    {
    System.out.println("greatest number : "+a);
    }
    else
    {
    System.out.println("greatest number :"+b);
    } 
 }

}