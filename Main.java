import java.util.*;
class Item
{
 int item_id;
 double price,quantity;
  void accept()
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the item id");
  item_id=sc.nextInt();
  System.out.println("enter the price ");
  price=sc.nextDouble();
  System.out.println("enter the quantity");
  quantity=sc.nextDouble();
  }
  double bill()
  {
  double total_price,total_bill=0;
  total_price=price*quantity;
    if(total_price>5000)
    {
     total_bill=total_price-(total_price*0.2);
    }
    else if(total_price<5000)
    {
    total_bill=total_price-(total_price*0.05);
    }
   return total_bill;
  }
}
class Main
{
  public static void main(String arg[])
  {
  Item i=new Item();
  i.accept();
  double x=i.bill();
  System.out.println("total bill amount with the discount is:"+x);
  }
}