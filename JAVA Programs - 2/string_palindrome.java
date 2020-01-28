import java.util.*;
class string_palindrome
{
    void main()
    {
        int l,i;
        char ch;
        String s1="",s;
        Scanner in=new Scanner (System.in);
        System.out.println("enter the word");
        s=in.next();
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
            ch=s.charAt(i);
            s1=s1+ch;
        }
        if(s1.equals(s))
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");
        }
    }
}
            
            