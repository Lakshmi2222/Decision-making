import java.util.Scanner;
public class nestedif
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int num1=9;
   int num2=7;
   int num3=4;
if(num1>num2)
{
  if(num1>num3)
{
   System.out.println("num1 is big");
}
else
{
   System.out.println("num2 is big");
}
}
else
{
if(num2>num3)
{
System.out.println("num3is big");
}
else
{
System.out.println("num2is big");
}
}
}
}






  