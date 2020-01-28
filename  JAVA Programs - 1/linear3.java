import java.util.*;
class linear3
{
    void main()
    {
        int k=0,i;
        char s;
        String name;
        
        Scanner in=new Scanner(System.in);
        char n[]={'v','i','k','r','a','m'};
        System.out.println("enter the char to be searched");
        s=in.next().charAt(0);
        for(i=0;i<7;i++)
        {
        if(s==n[i])
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