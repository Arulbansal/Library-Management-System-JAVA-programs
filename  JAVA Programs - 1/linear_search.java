import java.util.*;
class linear_search
{
    void main()
    {
        int k=0,i,ns=0;
        int s[]=new int[10];
        Scanner in=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(i=0;i<=10;i++)
        {
            s[i]=in.nextInt();
        }
        System.out.println("enter the number to be searched");
        ns=in.nextInt();
        for(i=0;i<=10;i++)
        {
        if(s[i]==ns)
        {
            k=1;
            break;
        }
    }
    if(k==1)
    {
        System.out.println("Search successful");
    }
    else
    {
        System.out.println("Search not successful");
    }
}
}