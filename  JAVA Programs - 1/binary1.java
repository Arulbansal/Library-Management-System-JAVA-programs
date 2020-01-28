import java.util.*;
class binary1
{
    void main()
    {
        int i,k=0,lb=0,ub=9,mid,ns;
        int n[]=new int[10];
        Scanner in=new Scanner(System.in);
        
        System.out.println("enter the array elements");
        for(i=0;i<10;i++)
        {
            n[i]=in.nextInt();
        }
        System.out.println("enter the no. to be searched");
        ns=in.nextInt();
        
        while(lb<=ub)
        {
            mid=lb+ub/2;
            if(n[mid]<ns)
            {lb=mid+1;}
            if(n[mid]>ns)
           { ub=mid-1;}
        if(n[mid]==ns)
            {k=1;
            break;}
        }
        if(k==1)
        {System.out.println("search successful");}
        else
        {System.out.println("search not successful");}
    }
}
    
            