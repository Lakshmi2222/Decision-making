class employeeapplication
{
   public static void main(String[] args)
{
   String name= "lakshmi";
   String eid= "19nf1a0467";
   int basic_salary= 25000;
   double ta= 15/100.0*basic_salary;
   double da=12/100.0*basic_salary;
   double hra=19/100.0*basic_salary;
   double total_salary= basic_salary+ta+da+hra;
   double totalmonths=12;
   double tax,pf;
if(total_salary>40000)
{
   System.out.println(total_salary+" greater than  "+total_salary);
    pf=11.0/100*basic_salary;
    tax=5.0/100*basic_salary;
}
else
{
    System.out.println(total_salary+"less than  "+total_salary);
    pf=7.0/100*basic_salary;
    tax=2.5/100*basic_salary;
}
    double final_salary=total_salary+tax-pf;
    System.out.println("final_salary= "+final_salary);
    double oneyearsalary=totalmonths*final_salary;
    System.out.println("oneyearsalary= "+oneyearsalary);
}
}


    
    


    
