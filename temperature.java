import java.util.Scanner;
public class temperature
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double celcius;
double frehanheit;
System.out.println("Enter the celcius value");
celcius= sc.nextDouble();
System.out.println("Enter the frehanheit value");
frehanheit= sc.nextDouble();
celcius=(frehanheit-32)*5/9;
System.out.println("celcius= "+celcius);
frehanheit=(celcius*5/9)+32;
System.out.println("frehanheit= "+frehanheit);
}
}
