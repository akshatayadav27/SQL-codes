//to check whether character is alphabet,digit or symbol
class Checkchar
{
 public static void main(String arg[])
 {
 char a;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter any character");
 a=sc.nextMethod().charAt(0);
  if(ch>64&&ch<91)
  {
  System.out.println(ch+"it is an upper case alphabet ");
  }
  else if(ch>96&&ch<123)
  {
  System.out.println(ch+"is an lower case alphabet");
  }
  else if(ch>47&&ch<58)
  {
  System.out.println(ch+"is a digit");
  }
  else
  { 
  System.out.println(ch+"is a special symbol");
  }
 }
}  