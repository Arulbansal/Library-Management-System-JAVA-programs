import java.util.*;
class string3
{
    void main()
    {
        String s;
        Scanner in=new Scanner (System.in);
        System.out.println("enter a string");
        s=in.next();
        int i,l,k=0;
        String s1;
        l=s.length();
        String n="not";
        
        for(i=0;i<l;i++)
        {
            s1=s.substring(0,2);
            
            if(s1.equals(n))
            {
                k=1;
                break;
            }
        }
        if(k==1)
        {
            System.out.println(s);
        }
         else
         {
             System.out.println(n+s);
            }
        
    }
}
                
            
            