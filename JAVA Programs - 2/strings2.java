import java .util.*;
class strings2
{
    void main()
    {
        String s;
        int i,l;
        Scanner in=new Scanner (System.in);
        System.out.println("enter a string");
        s=in.next();
        l=s.length();
        char ch=s.charAt(l-1);
        System.out.println("output: "+ch+s+ch);
    }
}
            
            
            
        