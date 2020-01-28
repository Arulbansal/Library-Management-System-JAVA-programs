import java.util.*;
class temperature
{
   void main()
   {
       Scanner in=new Scanner(System.in);
       int ch,t;
       double farenheit;
       double celsius;
       System.out.println("enter the choice as given below");
       System.out.println("1.celsius to fahrenheit");
       System.out.println("1.fahrenheit to celsius");
       System.out.println("enter the temperature");
       t=in.nextInt();
       System.out.println("enter your choice");
       ch=in.nextInt();
       switch(ch)
          {
               case 1:
                    farenheit=(1.8*t+32);
                   System.out.println(farenheit);
                   break;
                
                case 2:
                 
                    celsius=(5/9*t-32);
                   System.out.println(celsius);
                   break;
                
                default:
                 System.out.println("incorrect choice");
                   break;
                }
            }
        }
        
        
