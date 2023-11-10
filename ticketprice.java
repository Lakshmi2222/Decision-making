import java.util.Scanner;
public class ticketprice
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int age;
  System.out.println("Enter the age");
  age= sc.nextInt();
  double totalticketprice;
if(age>=0&&age<=12)
{
   totalticketprice= 20;
   System.out.println("totalticketprice= "+totalticketprice);
}
else if(age>=18&&age<=65)
{
   totalticketprice= 38;
   System.out.println("totalticketprice= "+totalticketprice);
}
else if(age>=65)
{
   totalticketprice= 35;
   System.out.println("totalticketprice= "+totalticketprice);
}
}
}