import java.util.*;
class employee
{
   int pan;
   String name;
   double taxincome;
   double tax;
   void input()
   { 
       Scanner in=new Scanner(System.in);
       System.out.println("enter the pan number");
       pan=in.nextInt();
       System.out.println("enter the name");
       name=in.next();
       System.out.println("enter the taxible income");
       taxincome=in.nextDouble();
    }
    void cal()
    {
        if(taxincome<=100000)
        tax=0;
    
        if(taxincome>=100001 && taxincome<=150000 )
        tax=(1/10)*(taxincome-100000);
        
        if(taxincome>=150001 && taxincome<=250000 )
        tax=5000+(20/100)*(taxincome-150000);
        
        if(taxincome>250000)
        tax=25000+(30/100)*(taxincome-250000);
    }
    void display()
    {
        System.out.println("pan number"+"\t"+"name"+"\t"+"tax income"+"\t"+"tax");
        System.out.println(pan+"\t"+"\t"+name+"\t"+taxincome+"\t"+tax);
    }
    void main()
    {
        employee ob=new employee();
        ob.input();
        ob.cal();
        ob.display();
    }
}
    
    