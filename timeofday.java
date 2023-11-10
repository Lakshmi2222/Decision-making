import java.util.Scanner;
public class timeofday
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   String greeting= "good afternoon";
   int hour= 24;
   int time;
System.out.println("Enter the time");
time=sc.nextInt();
if(time>=0&&time<=11)
{
System.out.println("good morning");
}
else if(time>=12&&time<=17)
{
System.out.println("good afternoon");
}
else if(time>=18&&time<=23)
{
System.out.println("good evening");
}
System.out.println(" ");
}
}