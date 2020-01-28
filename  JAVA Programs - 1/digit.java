import java.util.*;
class digit
{
void main()
{
   int r;
   int i=0;
   Scanner in=new Scanner(System.in);
   System.out.print("Enter the no. :");
   int n=in.nextInt();
   int num=n;
   while(num>0)
   {
       i=1;i++;
       num/=10;
    }
    
    if(n==0)
    
      {  System.out.println("the no. is a"+i+"digit number");}
    
}
}