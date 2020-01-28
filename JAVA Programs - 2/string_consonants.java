class string_consonants
{
    void main(String s)
    {
        int l,i,v=0,c=0;
        char ch;
        l=s.length();
        
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            v=v+1;
            c=l-v;
            }
        System.out.println("the no. of consonants are"+c);
    }
}