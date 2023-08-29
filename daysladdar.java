import java.util.Scanner;
class daysladdar
{
   public static void main(String[] args)
{
   Scanner sc= new Scanner(System.in);
   int days=7;
   System.out.println("Enter the first day");
   days= sc.nextInt();
if(days==1)
   System.out.println("monday");
else if(days==2)
   System.out.println("tuesday");
else if(days==3)
   System.out.println("wendsday");
else if(days==4)
   System.out.println("thursday");
else if(days==5)
   System.out.println("friday");
else if(days==6)
   System.out.println("saturday");
else if(days==7)
System.out.println("sunday");
}
}