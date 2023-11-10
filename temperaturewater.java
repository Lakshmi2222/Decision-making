import java.util.Scanner;
public class temperaturewater
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   double temperature=25;
if(temperature<0)
{
System.out.println("freezing");
}
else if(temperature<10)
{
System.out.println("cold");
}
else if(temperature<20)
{
System.out.println("moderate");
}
else if(temperature<30)
{
System.out.println("warm");
}
else if(temperature<40)
{
System.out.println("hot");
}
}
}




   