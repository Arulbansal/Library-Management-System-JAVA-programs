import java.util.*;
class string_piglatin
{
    void main()
    {
        int l,i;
        char ch;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the word ");
        String s=in.next();
        l=s.length();
        String s2,s3;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            break;
        }
        s2=s.substring(i,l);
        s3=s.substring(0,i);
        System.out.println(s2+s3+"ay");
    }
}
        
        
        