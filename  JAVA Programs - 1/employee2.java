class employee2
{
   void main(double basic)
   {
       double DA=75/100*basic;
       double HRA=25/100*basic;
       double PF=12/100 * basic + DA;
       double gross=basic + DA + HRA;
       double net=gross - PF;
       System.out.println("The gross salary of the employee:"+gross);
       System.out.println("The net salary of the employee:"+net);
    }
}