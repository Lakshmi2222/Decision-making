import java.util.Scanner;
public class nestedanother
{
   public static void main(String[] args)
{ 
   Scanner sc=new Scanner(System.in);
   int age;
   System.out.println("Enter the age");
   age= sc.nextInt();
   double workexperience;
   System.out.println("Enter the workexperience");
   workexperience= sc.nextDouble();
   boolean hasdegree;
   System.out.println("Enter the hasdegree");
   hasdegree= sc.nextBoolean();
if(age>21)
{
if(hasdegree)
{
System.out.println("candidates eligible");
}
else
{
System.out.println("candidate complete any degree");
}
}
else
{
if(workexperience>=2)
{
System.out.println("candidates is eligible");
}
else
{
System.out.println("candidates is not eligible");
}
}
}
}


   
  