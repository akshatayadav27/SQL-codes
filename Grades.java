
// to assign grades
import java.util.*;
class Grades
{
 public static void main(String arg[])
 {
 int a,b,c,d;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter marks of three subjects");
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 d=((a+b+c)*100/300);
 System.out.println("Percentage of three subjects is :"+d);
    if(d>40&&d<50)
    {
    System.out.println("Greade is:D");
    }
    else if(d>50&&d<60)
    {
    System.out.println("Greade is:C");
    } 
    else if(d>60&&d<70)
    {
    System.out.println("Greade is:B");
    }
    else if(d>70&&d<80)
    {
    System.out.println("Greade is:A");
    }
    else 
    {
    System.out.println("Greade is:FIRST CLASS WITH DISTINCTION");
    }
 }

}