class area 
{
    void main(int num,int l,int b,int r)
    {
        double area=0;
        switch(num)
        {
           case 1:
            area=l*b;
            break; 
          case 2:
            area=(3.14)*r*r;
            break;
             default:
            area=l*b;
            break;}
            System.out.println(area);
        
        }
    }