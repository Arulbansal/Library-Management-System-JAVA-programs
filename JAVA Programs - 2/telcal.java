import java.util.*;
class telcal
{
    long phno;
    String name;
    double amt,call,rent;
    
    telcal(long tphno,String tname,double tcall,double trent)
    {
        tphno=phno;
        tname=name;
        tcall=call;
        trent=rent;
    }
    void compute()
    {
        if(call>=1 && call<=100)
        amt=(500-rent);
        if(call>100 && call<=300)
        amt=(1*call)+rent;
        if(call>300)
        amt=(1.5*call)+rent;
    }
    void display()
    {
        System.out.println("name"+"\t"+"phone number"+"\t"+"bill amount");
        System.out.println(name+"\t"+phno+"\t"+amt);
    }
    void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name");
        name=in.next();
        System.out.println("enter your phno");
        phno=in.nextLong();
        System.out.println("enter the calls made by you");
        call=in.nextDouble();
        System.out.println("enter the rent");
        rent=in.nextDouble();
        
        telcal ob= new telcal(phno,name,call,rent);
        ob.compute();
        ob.display();
    }
}
        
    