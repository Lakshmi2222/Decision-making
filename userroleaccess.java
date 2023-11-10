import java.util.Scanner;
public class userroleaccess
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   String rolelevel="viewer";
if(rolelevel=="admin")
{
  System.out.println("as full access");
}
else if(rolelevel=="editor")
{
System.out.println("as editor access");
}
else if(rolelevel=="viewer")
{
System.out.println("as viewer");
}
}
}
