import java.util.Scanner;
public class seasonidentification
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int season;
   int month;
   System.out.println("Enter the month");
   month=sc.nextInt();
if(month>=3&&month<=5)
{
   System.out.println("spring");
}
else if(month>=9&&month<=2)
{
   System.out.println("winter");
}
else if(month>=6&&month<=8)
{   
System.out.println("summer");
}
}
}
   