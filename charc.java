import java.util.Scanner;
public class charc
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   char ch='a';
if(ch>=65&&ch<=90)
{
System.out.println("it is uppercase");
}
else if(ch>=97&&ch<=122)
{
System.out.println("it is lowercase");
}
else if(ch>=0&&ch<=9)
{
System.out.println("it is number");
}
else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("it is vowel");
}
else
{
System.out.println("it is consonant");
}
}
}







