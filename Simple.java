//to calculate S.I
import java.util.*;
class Simple
{
 public static void main(String str[])
 {
 double p,r,t,s;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the principal,rate of interest and time period");
 p=sc.nextDouble();
 r=sc.nextDouble();
 t=sc.nextDouble();
 
 s=(p*r*t)/100;
 System.out.println(s+ ": is the value of simple interest");
 }
}