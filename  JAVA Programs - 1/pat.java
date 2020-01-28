class pat
{
 static void pattern(int a)
 {
     int i,j,k;
     for(i=a;i>=1;i--)
     {
         for(j=a;j>i;j--)
         System.out.print(j);
         for(k=1;k<=i;k++)
         System.out.print(i);
         System.out.print("\n");
        }       }
}

