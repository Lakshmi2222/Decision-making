class monthinnoofdays
{
    public static void main(String[] args)
    {
        int m=1;
        if(m==1||m==3||m==5||m==7||m==8||m==10)
        {
            System.out.println("31 days");
        }
        else if(m==4||m==6||m==9||m==10)
        {
            System.out.println("30days");
        }
        else if(m%4==0&&m%100!=0||m%400==0)
        {
            System.out.println("29 days");
        }
        else if(m==2)
        {
            System.out.println("28 days");
        }
        else
        {
        System.out.println("invalid");
            
        }
        
    }
}