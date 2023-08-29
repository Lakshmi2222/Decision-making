class studentapplication
{
   public static void main(String[] args)
{
   String sname= "vk";
   int srollno= 32;
   char section='A';
   double maxmarks=600;
   double total_sub_marks;
   int s1=75, s2=65, s3=76, s4=44, s5=90, s6=37;
   double totalmarks= s1+s2+s3+s4+s5+s6;
   double percentage=totalmarks/600.0*100;
   double fee;
   double totalfee=50000;
   int donation= 0;
   int scholorship =15000;
   
   
   
if(percentage>80)
{
   System.out.println(percentage+" greaterthan  "+percentage);
   section='A';
   scholorship=10000;
   donation=0;
   String grade="distinction";
}
else
{
   System.out.println(percentage+" lessthan  "+percentage);
   section='B';
   scholorship=0;
   donation=15000;
   String grade ="fail";
}
   fee= totalfee+donation-scholorship;
   System.out.println(" total fee to be paid :"+fee);
}
}




