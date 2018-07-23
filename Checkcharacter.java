// to do addition if user enter a or A else invalid choice
import java.util.*;
class Checkcharacter
{
 public static void main(String arg[])
 {
  char ch;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any character");
  ch=sc.next().charAt(0);
  if(ch=='a'||ch=='A')
  {
  int a,b;
  System.out.println("enter any two numbers");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println(a+b+ ": is addition");
  }
  else
  {
  System.out.println("invalid choice");
  }
 }
}