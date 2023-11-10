import java.util.Scanner;
public class dayofweek
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int daysofweek;
   System.out.println("Enter the daysofweek:");
   daysofweek=sc.nextInt();
if(daysofweek==1)
{
System.out.println("monday");
}
else if(daysofweek==2)
{
System.out.println("tuesday");
}
else if(daysofweek==3)
{
System.out.println("wendsday");
}
else if(daysofweek==4)
{
System.out.println("thursday");
}
else if(daysofweek==5)
{
System.out.println("friday");
}
else if(daysofweek==6)
{
System.out.println("saturday");
}
else if(daysofweek==7)
{
System.out.println("sunday");
}
else
{
System.out.println("Invalid day");
}
}
}


