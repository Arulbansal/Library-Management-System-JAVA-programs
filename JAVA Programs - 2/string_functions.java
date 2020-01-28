class string_functions
{
    void main(String s)
    {
        int i,l;
        char ch;
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            System.out.println(ch);
        }
    }
}