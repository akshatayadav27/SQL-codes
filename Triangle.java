
// to check the type of triangle
import java.util.*;
class Triangle
{
 public static void main(String arg[])
 {
 int a,b,c;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter three sides of triangle");
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
    if(a==b&&b==c&&c==a)
    {
    System.out.println("it is an equilateral triangle");
    }
    else if(a==b||b==c||c==a)
    {
    System.out.println("it is an isoscales triangle");
    } 
    else 
    {
    System.out.println("it is a scalen triangle");
    } 
 }

}