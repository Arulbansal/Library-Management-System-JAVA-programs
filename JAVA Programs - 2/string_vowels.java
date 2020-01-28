class string_vowels
{
    void main(String s)
    {
        int l,i,v=0;
        char ch;
        l=s.length();
        
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            v=v+1;
        }
        System.out.println(v);
    }
}
    
        