import java.util.*;
class string_mix
{
    void main()
    {
        int l,i,v=0;
        char ch;
        int ch1=0;
        String s1="",s;
        Scanner in=new Scanner (System.in);
        System.out.println("enter the word");
        s=in.next();
        l=s.length();
        for(i=0;i<l;i++)
        {
           ch=s.charAt(i);
           ch1=ch1+1;
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            v=v+1;
        }
           System.out.println("the no.of characters "+ch1);
           System.out.println("the no.of vowels "+v);
        for(i=l-1;i>=0;i--)
        {
            ch=s.charAt(i);
            s1=s1+ch;
        }
           System.out.println("the reversed word is "+s1);
    }
}
            
            