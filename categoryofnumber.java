import java.util.Scanner;
public class categoryofnumber
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int num;
   System.out.println("Enter the first num");
   num= sc.nextInt();
if(num>0)
{
System.out.println("positive");
}
else if(num<0)
{
System.out.println("negative");
}
else if(num==0)
{
System.out.println("eual to zero");
}
else if(num>=0&&num<=9)
{
System.out.println("single digit");
}
else if(num>=10&&num<=99)
{
System.out.println("two digit");
}
else if(num>=100&&num<=999)
{
System.out.println("three digit");
}
else if(num>=1000&&num<=9999);
{
System.out.println("fourth digit");
}
}
}