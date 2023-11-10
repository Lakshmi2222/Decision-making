import java.util.Scanner;
public class oddorevendigitscounter
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   long num;
   System.out.println("enter the num");
   num= sc.nextLong();
   int evencount=0;
   int oddcount=0;
if(num%2==0)
{
double digit=num%10;
num=num/10;
evencount++;
}
else
{
oddcount++;
}
}
}    