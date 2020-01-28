import java.util.*;
class linear2
{
    void main()
    {
        int k=0,i;
        String ns;
        String s[]=new String[10];
        Scanner in=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(i=0;i<10;i++)
        {
            s[i]=in.next();
        }
        System.out.println("enter the name to be searched");
        ns=in.next();
        
        for(i=0;i<10;i++)
        {
        if(s[i].equals(ns))
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