import java.util.*;
class Hotel
{
 int id,price,no_of_rooms;
 String name,room_type;
 void accept()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the hotel id");
 id=sc.nextInt();
 System.out.println("enter the hotel name");
 name=sc.next();
 System.out.println("enter the room type");
 room_type=sc.next();
 System.out.println("enter the no_of_rooms");
 no_of_rooms=sc.nextInt();
 System.out.println("enter the price");
 price=sc.nextInt();
 }
 double getBill()
 {
 double payment;
 payment=(price*no_of_rooms);
 return payment;
 }
}
class Main1 
{
 public static void main(String arg[])
 {
 Hotel h=new Hotel();
 h.accept();
 double x=h.getBill();
 System.out.println("total payment is:"+x);
 }
}