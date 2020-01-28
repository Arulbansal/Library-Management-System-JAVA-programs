import java.util.*;
class palindrome
{
    void main()
{
     int r=0;int s=0;int num=0;
     Scanner in=new Scanner(System.in);
     System.out.print("enter the no:");
     int n=in.nextInt();
     n=num;
     
    for(int i=1;num>0;i++)
    {
        r=num%10;
        s=(s*10)+r;
        num=num/10;
    }
            if(n==s)
            {
                System.out.println("yes");
            }
            else
            {
                 System.out.println("no");
            }
            }
        }



                
        
    