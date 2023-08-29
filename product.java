class product
{
   public static void main(String[] args)
{
   String pname= "sheos";
   int pcod= 34;
   int pquantity= 2;
   int pprice= 700;
   double discount;
   int totalprice= pprice*pquantity;
if(totalprice>=2000)
{
   System.out.println(totalprice+"greaterthan equal "+2000);
   discount=10/100.0*totalprice;
}
else
{
   System.out.println(totalprice+"lessthan equal"+2000);
   discount=5.0/100*totalprice;
}
   
  
}
}


   