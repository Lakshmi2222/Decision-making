import java.util.Scanner;
class leapyear
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int n;
   System.out.println("Enter the first number:");
   n= sc.nextInt();
if(n%4==0)
{
   System.out.println("IT IS LEAP YEAR");
}
else
{
   System.out.println("IT IS NOT LEAP YEAR");
}
}
}