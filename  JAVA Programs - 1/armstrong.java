import java.util.*;
class armstrong
{
void main()
{
   int r,s;
   s=0;
   Scanner in=new Scanner(System.in);
   System.out.print("Enter the no. :");
   int n=in.nextInt();
   int num=n;
   for (int i=1;num>0;i++)
   {
       r=num%10;
       s+=r*r*r;
        num/=10;
    }
    
    if(n==s)
    
      {  System.out.println("the no. is an armstrong no.");}
    
    if(n!=s)
    {
        System.out.println("the no. is not an armstrong no.");
    }
}
}