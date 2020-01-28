import java.util.*;
class asciivalue
{
    public static void main()
    {
        int asciival=0;
        char character;
        String thread = "";
        System.out.println(" ASCII value printer ");
        for(int i=1;i<=256;i++)
        {
            character = (char)i;
            asciival=i;
            System.out.println(" Character : "+character+" ASCII : "+asciival);
        }
    }

}
