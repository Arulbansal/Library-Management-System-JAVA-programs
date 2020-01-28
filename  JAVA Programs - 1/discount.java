class discount
{
   void main(int amount)
   {
       double sp1;
       double sp2;
       sp1=(100-30)/100*amount;
       sp2=(100-10)/100*(100-20)/100*amount;
        if(sp1>sp2)
       {
           System.out.println("Tata sky offers a cheaper deal");
        }
        else
       {
           System.out.println("Dish tv offers a cheaper deal");
        }
    }
}
       