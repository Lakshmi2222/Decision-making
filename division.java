import java.util.Scanner;
class division
{
   public static void main(String[] args)
{
   Scanner sc= new Scanner(System.in);
   int n1,n2;
   System.out.println("Enter the first number");
   n1=sc.nextInt();
   System.out.println("Enter the second number");
   n2=sc.nextInt();
if(n1%n2!=0)
{
   System.out.println(n1+" is not division to"+n2);
}
else
{
   System.out.println(n1+" is division to "+n2);
}
}
}
