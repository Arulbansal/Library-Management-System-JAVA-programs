class electricity
{
   void main(int unit)
   {
       double charge=0;       
       if(unit<=50)
       {charge=0;}
       if(unit>50 && unit<=100)
       {charge=0.75*unit;}
       if(unit>100 && unit<=250)
       {charge=1.25*unit;}
       if(unit>250 && unit<=500)
       {charge=2.20*unit;}
       if(unit>500)
       {charge=1.25*unit;}
    
    System.out.println("the charge is:"+"Rs"+charge);
}
}

      
     