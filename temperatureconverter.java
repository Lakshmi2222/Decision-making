import java.util.Scanner;
public class temperatureconverter
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
double celcius;
double frehanheit;
int choice;
System.out.println("choices an options:");
choice=sc.nextInt();
System.out.println("1:celcius to frehanheit");
System.out.println("2:frehanheit to celcius");
if(choice==1)
{
System.out.println("Enter the celcius value");
celcius= sc.nextDouble();
frehanheit=(celcius*5/9)+32;
System.out.println("frehanheit="+frehanheit);
}
else if(choice==2)
{
System.out.println("Enter the frehanheit value");
frehanheit= sc.nextDouble();
celcius=(frehanheit-32)*9/5;
System.out.println("celcius= "+celcius);
}
}
}
