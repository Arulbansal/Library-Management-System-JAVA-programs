import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;
class library_management
{ 
    /**
     * Vikram's 10th project
     */
    public static void main()
    {

        Scanner in=new Scanner (System.in);
        System.out.println("**********************************************************************************************************************");
        System.out.println("                                       WELCOME TO LIBRARY MANAGEMENT SYSTEM                                           ");
        System.out.println("**********************************************************************************************************************");
        System.out.println(" ");
        System.out.println("1.Login with an existing account.");
        System.out.println("2.Create a new account. ");
        System.out.println("Enter your choice:");
        int ch=in.nextInt();
        library_management ob=new library_management();
        if(ch==1)
        {
            ob.login();
        }
        else if(ch==2)
        {
            ob.create_new_account();

        }
        System.out.println("Functions available with our Library Management System:");
        System.out.println("1.Add new book or Book Registration.");
        System.out.println("2.Add new CD's or DVD's.");
        System.out.println("3.Buy Examination Papers.");
        System.out.println("4.Buy Newspapers or Magazine.");
        System.out.println("5.Staff Registration.");
        System.out.println("6.Student Registration.");
        System.out.println("7.Issue Books.");
        System.out.println("8.Return Books.");
        System.out.println("9.Search books.");
        System.out.println("Enter 0 to Exit the terminal window and any other number to continue.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}

            System.exit(0);
        }
        else
        {
            System.out.println("Enter your choice:");
            int ch1=in.nextInt();

            switch(ch1)
            {
                case 1:
                {
                    ob.bookregister_ISBN();
                    ob.bookregister_remaining();
                }
                case 2:
                {
                    ob.cd();
                }
                case 3:
                {
                    ob.examination();
                }
                case 4:
                {
                    ob.newspapers();
                }
                case 5:
                {
                    ob.staff();
                }
                case 6:
                {
                    ob.student();
                }
                case 7:
                {
                    ob.issue();
                }
                case 8:
                {
                    ob.returns();
                }
                case 9:
                {
                    ob.search();
                }
                default:
                {
                  System.out.println("Incorrect choice");
                }
            }
        }
    }

    void login()    
    {
        String username;
        int password;
        int l;
        int ch; 

        for(int retry=10;retry<=10;retry--)
        {
            Scanner in=new Scanner (System.in);  
            System.out.println("Enter your User name");
            username=in.next();
            System.out.println("Enter your Password");
            password=in.nextInt();
            l=username.length();
            if(password==l)
            {
                System.out.println("Legal password");
                break;
            }
            else
            {
                System.out.println("Your username and password is INCORRECT.Please enter correctly");
                System.out.println("You have "+retry+" attempts remaining");
                continue; 

            }
        }

    }

    void create_new_account()
    {
        String name="";
        Scanner in=new Scanner (System.in);
        System.out.println("*******************************************Create new account.******************************************************");
        System.out.println("Fill up the following details.");
        for(int i=0;i<=50;i++)
        {
            System.out.println("Name: ");
            name=in.next();
            int l=name.length();
            if(l>=5)
            {
                break;
            }
            else
            {
                System.out.println("Your name should be more than 5 characters.");
            }
        }
        
        for(int i=0;i<=50;i++)
        {
            
            System.out.println("Phone Number: ");
            String phno=in.next();
            int l1=phno.length();
            if(l1==10)
            {
               break;
            }
            else
            {
                System.out.println("Your phone number must have 10 numbers.");
            }
        }
  
        System.out.println("Address: ");
        String add=in.next();
        System.out.println("E-mail account: ");
        String email=in.next();
        
        for(int i=0;i<=50;i++)
        {
            System.out.println("Gender: ");
        String g=in.next();
        String s="male";
        String s1="female";
        if(g.equalsIgnoreCase(s) || g.equalsIgnoreCase(s1))
        {
            break;
        }
        else
        {
            System.out.println("Enter the correct gender");
        }
        }
        System.out.println("------------------------------------------Terms and Conditions----------------------------------------------------");
        System.out.println("You must maintain the silence in the library.");
        System.out.println("You must pay Rs.200 every month.");
        System.out.println("You will be allowed to take maximum of 5 books at a time.");
        System.out.println("The library will be open from 6:30 am to 6:30 pm.");
        System.out.println("You will be able to take any books,add new books,take any newspapers and magazines and also Examination papers.");
        System.out.println("You will be able to borrow for a period of 1 week.After that you should return or you can renew it.");
        System.out.println("Fine will be charged if not returned or renewed on time.");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter your choice.1.Accept or 2.Reject.");
        int ch=in.nextInt();
        if(ch==1)
        {
            System.out.println("Thanks for accepting the Terms and Conditions.Now,You have become a Member of our Library.");
            System.out.println("Your username:"+name);
            System.out.println("Your password is: "+name.length());
            System.out.println("-------------------------------------------I hope you enjoy our services.---------------------------------------");
        }
        if(ch==2)
        {
            System.out.println("Please give your valuable feedbacks so that we can improve on that.");
            String f=in.next();
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}

            System.exit(0);
        }
    }  

    void bookregister_ISBN()
    {
        String s1="";
        long s=0;
        System.out.println("*******************************************Book Registration.*********************************************************");
        System.out.println("  ");
        Scanner in=new Scanner (System.in);  
        int i,l=0,i1;
        char ch;
        double ans=1,r=1,sum=0;
        System.out.println("Enter the ISBN code.");

       
        while(true)
        {
             s=in.nextLong();
             s1=Long.toString(s);
            l=s1.length();
            if(l==10)
            { break;
               
            }
            else
            {
                System.out.println("Please enter the correct ISBN number");
             
            }
        }    

        for(i=0;i<l;i++)
        {
            ch=s1.charAt(i);
            int y=(int)ch;
            y=y-48;
            i1=i+1;
            r=(y*i1);
            sum=sum+r;

        }
        ans=sum%11;
        while(true)
        {
            if(ans==0)
            {
               
                System.out.println("Legal ISBN.");
                break;

            }
            else
            {
                System.out.println("Please enter the correct ISBN number.");
                s=in.nextLong();
            }
        }

    }

    void bookregister_remaining()
    {
        int edition=0;
        Scanner in=new Scanner(System.in);
        for(int i=0;i<=50;i++)
        {
            System.out.println("Edition.");
            edition=in.nextInt();
            if(edition>=1950 && edition<=2015)
            {
                break;
            }
            else
            {
                System.out.println("Your book edition should be between 1950 to 2015");
            }
        }

        System.out.println("Book title.");
        String title=in.next();
        System.out.println("Author Name.");
        String author=in.next();
        System.out.println("Cost Price.");
        int cp=in.nextInt();
        System.out.println("Selling Price.");
        int sp=in.nextInt();
        System.out.println("Number of pages.");
        int pages=in.nextInt();

        double gain=sp-cp;
        double gainp=(gain/cp)*100;

        System.out.println("*****************************************************************************************************************");
        System.out.println("-------------------------------------Member's Bill---------------------------------------------------------------");                                 
        System.out.println("*****************************************************************************************************************");
        System.out.println("Title of the book sold:    "+title);
        System.out.println("Edition:                   "+edition);
        System.out.println("Author name:               "+author);
        System.out.println("Cost Price of the book:    "+cp);
        System.out.println("Selling Price of the book: "+sp);
        System.out.println("Gain for the member:       "+gain);
        System.out.println("Gain % for the member:     "+gainp);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Thanks for selling.");
        System.out.println("Enter 0 to Exit the terminal window and 1 to go to the main window.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}
            System.exit(0);
        }
        if(ch2==1)
        {
            library_management ob=new library_management();
            ob.main();
        }
        else
        {
            System.out.println("Incorrect choice.");
        }

    }

    void cd()
    {
        String name="";
        Scanner in=new Scanner(System.in);
        System.out.println("*******************************************************Add new CD's or DVD's.*************************************************************");
        System.out.println(" ");
        System.out.println("Title: ");
        String title=in.next();
        System.out.println("Category: ");
        String c=in.next();
        System.out.println("Language:");
        String lang=in.next();  
        System.out.println("Number of discs: ");
        int disc=in.nextInt();
        System.out.println("Selling Price: ");
        int sp=in.nextInt();
        System.out.println("*********************************************************Publisher's info.******************************************************************");
        System.out.println(" ");
        for(int i=0;i<=50;i++)
        {

            System.out.println("Name: ");
            name=in.next();
            int l=name.length();
            if(l>=5)
            {
                break;
            }
            else
            {
                System.out.println("Your name should be more than 5 characters.");
            }
        }
        System.out.println("Address: ");
        String add=in.next();
        System.out.println("Email-ID: ");
        String email=in.next();
        for(int i=0;i<=50;i++)
        {
            System.out.println("Phone Number: ");
            String phno=in.next();
            int l1=phno.length();
            if(l1==10)
            {
                break;
            }
            else
            {
                System.out.println("Your phone number must have 10 numbers.");
            }
        }

        double amt=sp*disc;
        System.out.println("*****************************************************************************************************************");
        System.out.println("-------------------------------------------------Member's Bill---------------------------------------------------------------");                                 
        System.out.println("*****************************************************************************************************************");
        System.out.println("Name:         "+name);
        System.out.println("Title:        "+title);
        System.out.println("Language:     "+lang);
        System.out.println("Total amount: "+amt);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Thanks for selling.");
        System.out.println("Enter 0 to Exit the terminal window and 1 to go to the main window.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}
            System.exit(0);
        }
        if(ch2==1)
        {
            library_management ob=new library_management();
            ob.main();
        }
        else
        {
            System.out.println("Incorrect choice.");
        }

    }

    void examination()
    {
        String name="", phno="";
        int year=0;
        int clas=0;
        String lang="";
        Scanner in=new Scanner(System.in);
        System.out.println("*******************************************Examination Papers.******************************************************************");
        
        for(int i=0;i<=50;i++)
        {
        System.out.println("Subject:(English,kannada,Maths,Science,Computers)");
        lang=in.next();
        if(lang.equalsIgnoreCase("english")|| lang.equalsIgnoreCase("kannada") || lang.equalsIgnoreCase("Maths") || lang.equalsIgnoreCase("Science") || lang.equalsIgnoreCase("Computers"))
        {
            break;
        }
        else
        {
            System.out.println("This subject is not available in our library");
            
        }
        }  
        
        for(int i=0;i<=50;i++)
        {
            System.out.println("Class: ");
            clas=in.nextInt();

            if(clas>=1 && clas<=10)
            {
                break;
            }
            else
            {
                System.out.println("Your class should be between 1 to 10.");
            }
        }

        for(int i=0;i<=50;i++)
        {
            System.out.println("Year: ");
            year=in.nextInt();
            if(year>=1990 && year<=2015)
            {
                break;
            }
            else
            {
                System.out.println("The Examination Papers are available only between year 1990 to 2015.");
            }
        }
        
        System.out.println("*******************************************Customer's info.******************************************************************");
        System.out.println(" ");
        for(int i=0;i<=50;i++)
        {

            System.out.println("Name: ");
            name=in.next();
            int l=name.length();
            if(l>=5)
            {
                break;
            }
            else
            {
                System.out.println("Your name should be more than 5 characters.");
            }
        }
        System.out.println("Address: ");
        String add=in.next();
        System.out.println("Email-ID: ");
        String email=in.next();
        for(int i=0;i<=50;i++)
        {
            System.out.println("Phone Number: ");
            phno=in.next();
            int l1=phno.length();
            if(l1==10)
            {
                break;
            }
            else
            {
                System.out.println("Your phone number must have 10 numbers.");
            }
        }
        System.out.println("*****************************************************************************************************************");
        System.out.println("-------------------------------------Member's Bill---------------------------------------------------------------");                                 
        System.out.println("*****************************************************************************************************************");
        System.out.println("Name:           "+name);
        System.out.println("Class:          "+clas);
        System.out.println("Contact number: "+phno);
        System.out.println("Subject:        "+lang);
        System.out.println("Year:           "+year);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Thanks for buying the Exam papers.");
        System.out.println("Enter 0 to Exit the terminal window and 1 to go to the main window.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}
            System.exit(0);
        }
        if(ch2==1)
        {
            library_management ob=new library_management();
            ob.main();
        }
        else
        {
            System.out.println("Incorrect choice.");
        }
    }

    void newspapers()
    {
        String name="",phno="";
        Scanner in=new Scanner(System.in);
        System.out.println("*******************************************Newspaper's/Magazine's.******************************************************************");
        System.out.println(" ");
        System.out.println("Name of the Newspaper/Magazine: ");
        String n=in.next();
        System.out.println("Language: ");
        String lang=in.next();
        System.out.println("Price of the Newspaper/Magazine: ");
        int price=in.nextInt();
        System.out.println("*******************************************Customer's info.******************************************************************");
        System.out.println(" ");
        for(int i=0;i<=50;i++)
        {
            System.out.println("Name: ");
            name=in.next();
            int l=name.length();
            if(l>=5)
            {
                break;
            }
            else
            {
                System.out.println("Your name should be more than 5 characters.");
            }
        }
        System.out.println("Address: ");
        String add=in.next();
        System.out.println("Email-ID: ");
        String email=in.next();
        for(int i=0;i<=50;i++)
        {
            System.out.println("Phone Number: ");
            phno=in.next();
            int l1=phno.length();
            if(l1==10)
            {
                break;
            }
            else
            {
                System.out.println("Your phone number must have 10 numbers.");
            }
        }

        int amt=price*30;

        System.out.println("*****************************************************************************************************************");
        System.out.println("-------------------------------------Member's Bill---------------------------------------------------------------");                                 
        System.out.println("*****************************************************************************************************************");
        System.out.println("Name:                           "+name);
        System.out.println("Contact number:                 "+phno);
        System.out.println("Name of the Newspaper/Magazine: "+n);
        System.out.println("Language:                       "+lang);
        System.out.println("Total amount per month:         "+amt);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Thanks for subscribing the Newspaper/Magazine.");
        System.out.println("Enter 0 to Exit the terminal window and 1 to go to the main window.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}
            System.exit(0);
        }
        if(ch2==1)
        {
            library_management ob=new library_management();
            ob.main();
        }
        else
        {
            System.out.println("Incorrect choice.");
        }

    }

    void staff()
    { String name="";
        Scanner in=new Scanner(System.in);
        System.out.println("*******************************************Staff Registration.*************************************************************************");
        System.out.println(" ");
        System.out.println("Staff ID: ");
        int id=in.nextInt();
        for(int i=0;i<=50;i++)
        {
            System.out.println("Staff's name: ");
            name=in.next();
            int l=name.length();
            if(l>=5)
            {
                break;
            }
            else
            {
                System.out.println("Your name should be more than 5 characters.");
            }
        }
        System.out.println("Designation: ");
        String d=in.next();
        System.out.println("Department:");
        String dept=in.next();
        System.out.println("********************************************************************************************************************************");
        System.out.println("Thanks for joining our Library.Your name has been registered");
        System.out.println("Enter 0 to Exit the terminal window and 1 to go to the main window.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}
            System.exit(0);
        }
        if(ch2==1)
        {
            library_management ob=new library_management();
            ob.main();
        }
        else
        {
            System.out.println("Incorrect choice.");
        }
    }

    void student()
    { 
        String name="",roll="";
        Scanner in=new Scanner(System.in);
        System.out.println("*******************************************Student Registration.*************************************************************************");
        System.out.println(" ");
        System.out.println("Student ID: ");
        int id =in.nextInt();
        for(int i=0;i<=50;i++)
        {
            System.out.println("Student's name: ");
            name=in.next();
            int l=name.length();
            if(l>=5)
            {
                break;
            }
            else
            {
                System.out.println("Your name should be more than 5 characters.");
            }
        }

        for(int i=0;i<=50;i++)
        {
            System.out.println("Roll number: ");
            roll=in.next();
            int l1=roll.length();
            if(l1>=1 && l1<=50)
            {
                break;
            }
            else
            {
                System.out.println("Your roll number should be between 1 to 50.");
            }
        }

        for(int i=0;i<=50;i++)
        {
            System.out.println("Class: ");
            int clas=in.nextInt();

            if(clas>=1 && clas<=10)
            {
                break;
            }
            else
            {
                System.out.println("Your class should be between 1 to 10.");
            }
        }
        System.out.println("Address: ");
        String address=in.next();
        System.out.println("********************************************************************************************************************************");
        System.out.println("Thanks for joining our Library.Your name has been registered");
        System.out.println("Enter 0 to Exit the terminal window and 1 to go to the main window.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}
            System.exit(0);
        }
        if(ch2==1)
        {
            library_management ob=new library_management();
            ob.main();
        }
        else
        {
            System.out.println("Incorrect choice.");
        }
    }

    void issue()
    {
        String name="";
        int clas=0;
        Scanner in=new Scanner(System.in);
        System.out.println("*******************************************Issue Books.*************************************************************************");
        System.out.println(" ");
        System.out.println("Student ID: ");
        int id =in.nextInt();
        for(int i=0;i<=50;i++)
        {
            System.out.println("Student's name: ");
            name=in.next();
            int l=name.length();
            if(l>=5)
            {
                break;
            }
            else
            {
                System.out.println("Your name should be more than 5 characters.");
            }
        }
        for(int i=0;i<=50;i++)
        {
            System.out.println("Class: ");
            clas=in.nextInt();

            if(clas>=1 && clas<=10)
            {
                break;
            }
            else
            {
                System.out.println("Your class should be between 1 to 10.");
            }
        }
        System.out.println("Book number: ");
        String no=in.next();
        System.out.println("Book title: ");
        String title=in.next();
        System.out.println("Number of books borrowed: ");
        int b=in.nextInt();
        System.out.println("********************************************************************************************************************************");
        System.out.println("Thanks for borrowing a book from our Library.You should return or renew it after 7 days.");
        System.out.println("Enter 0 to Exit the terminal window and 1 to go to the main window.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}
            System.exit(0);
        }
        if(ch2==1)
        {
            library_management ob=new library_management();
            ob.main();
        }
        else
        {
            System.out.println("Incorrect choice.");
        }
    }

    void returns()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("*******************************************Return Books.*************************************************************************");
        System.out.println(" ");
        System.out.println("Student ID: ");
        int id =in.nextInt();
        System.out.println("Book number: ");
        int no=in.nextInt();
        System.out.println("Book title: ");
        String title=in.next();
        System.out.println("Number of books borrowed: ");
        int b=in.nextInt();
        System.out.println("Issue day: ");
        int i=in.nextInt();
        System.out.println("Return day: ");
        int r=in.nextInt();
        
        int fine=r-i;
        
        System.out.println("********************************************************************************************************************************");
        if(fine<=7)
        {
            System.out.println("Thanks for borrowing book from our Library.Your fine is Rs.0.");
        }

        if(fine>7)
        {
            System.out.println("Thanks for borrowing book from our Library.Your fine is Rs: "+fine);
        }
        System.out.println("Enter 0 to Exit the terminal window and 1 to go to the main window.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}
            System.exit(0);
        }
        if(ch2==1)
        {
            library_management ob=new library_management();
            ob.main();
        }
        else
        {
            System.out.println("Incorrect choice.");
        }
    }

    void search()
    {
        int i,k=0;
        Scanner in=new Scanner(System.in);
        System.out.println("*******************************************Search Books.*****************************************************************************");
        System.out.println(" ");
        System.out.println("Names of great authors: ");
        System.out.println("1.Agatha Christie");
        System.out.println("2.Jeffrey Archer");
        System.out.println("3.Chetan Bhagat");
        System.out.println("4.Sir Arthur Conan Doyle");
        System.out.println("5.William Shakespeare");
        System.out.println("6.J.K.Rowling");
        System.out.println("7.Charles Dickens");
        System.out.println(" ");
        System.out.println("Enter the code of the author of the book to be searched");
        int ch=in.nextInt();
        if(ch==1)
        {
            String agatha[]={"1.The Mysterious Affair at Styles","2.The Secret Adversary","3.The Murder on the Links","4.The Man in the Brown Suit","5.The Secret of Chimneys","6.The Murder of Roger Ackroyd","7.The Big Four","8.The Mystery of the Blue Train","9.The Seven Dials Mystery","10.The Murder at the Vicarage","11.The Sittaford Mystery","12.Peril at End House","13.Lord Edgware Dies","14.Murder on the Orient Express","15.Why Didn't They Ask Evans?","16.Three Act Tragedy","17.Death in the Clouds","18.The A.B.C. Murders","19.Murder in Mesopotamia","20.Cards on the Table","21.Dumb Witness","22.Death on the Nile","23.Appointment with Death"};

            for(i=0;i<23;i++)
            {
                System.out.println(agatha[i]);
                
            }
            System.out.println("These are the books written by Agatha Christie which are present in our library.");
        }

        if(ch==2)
        {
            String jeffrey[]={"1.Kane and Abel","2.A Prisoner of Birth","3.Not a Penny More","4.Not a Penny Less ","5.Only Time Will Tell ","6.The Prodigal Daughter","7.The Sins of the Father","8.As the Crow Flies ","9.Paths of Glory ","10.Honor Among Thieves ","11.A Matter of Honor ","12.Sons of Fortune","13.A Quiver Full of Arrows","14.Shall We Tell the President?","15.First Among Equals ","16.False Impression","17.A Twist in the Tale","18.The Fourth Estate","19.Twelve Red Herrings","20.The Eleventh Commandment","21.And Thereby Hangs A Tale","22.To Cut a Long Story Short","23.Cat O' Nine Tales: And Other Stories","24.Hell","25.Best Kept Secret","25.Purgatory","26.Beyond Reasonable Doubt","27.The Grass Is Always Greener"};

            for(i=0;i<27;i++)
            {
                System.out.println(jeffrey[i]);
                
            }
            System.out.println("These are the books written by Jeffrey Archer which are present in our library.");
        }
        if(ch==3)
        {
            String chetan[]={"1.Making India Awesome","2.Half Girlfriend","3.What Young India Wants","4.Revolution 2020","5.Two STATES","6.The 3 Mistakes of my Life","7.One Night @ the Call Center","8.Five Point Someone"}; 

            for(i=0;i<8;i++)
            {
                System.out.println(chetan[i]);
                
            }
            System.out.println("These are the books written by Chetan Bhagat which are present in our library.");
        }

        if(ch==4)
        {
            String conan[]={"1.A Study in Scarlet","2.The Adventures of Sherlock Holmes","3.The Hound of the Baskervilles","4.The Sign of Four","5.The Complete Sherlock Holmes","6.The Memoirs of Sherlock Holmes","7.The Lost World","8.His Last Bow","9.The Valley of Fear ","10.Sherlock Holmes: The Complete Novels and Stories, Volume I ","11.The Case-Book of Sherlock Holmes ","12.The Original Illustrated Sherlock Holmes: 37 Short Stories Plus a Complete Novel ","13.A Scandal in Bohemia ","14.The Poison Belt","15.The Complete Sherlock Holmes, Vol 2 ","16.A Study in Scarlet and The Sign of Four ","17.The Five Orange Pips","18.When the World Screamed","19.The Lost World & Other Stories","20.The New Annotated Sherlock Holmes, Volume III: The Novels","21.Sherlock Holmes: The Complete Illustrated Short Stories ","22.The Adventure of the Greek Interpreter"};

            for(i=0;i<22;i++)
            {
                System.out.println(conan[i]);
                
            }
            System.out.println("These are the books written by Arthur Conan Doyle which are present in our library.");
        }

        if (ch==5)
        {
            String shakespeare[]={"1.Natsu No Yo No Yume. Arashi ","2.Three Comedies","3.Othello, Revised Edition","4.Shakespeare's Sonnets: The Complete Illustrated Edition","5.A Midsummer Night","6.Macbeth","7.william shakespeare: top 100 greatest sonnets of all time ","8.The Philosophy of William Shakespeare","9.The Complete Works","10.William Shakespeare quotes ","11.The Winter's Tale: Easiest-to-Read Edition","12.Hamlet","13.Oxford School Shakespeare: Love's Labour's Lost","14.Othello ","15.Henry V With Side-By-Side Modern English Translation","16.Richard III: Easiest-to-read edition","17.The Taming of the Shrew: Easiest-to-Read Edition","18.William Shakespeare's Romeo & Juliet","19.King Lear","20.Henry V: Easiest-to-Read Edition"};

            for(i=0;i<20;i++)
            {
                System.out.println(shakespeare[i]);
                
            }
            System.out.println("These are the books written by William Shakespeare which are present in our library.");
        }
        if(ch==6)
        {
            String rowling[]={"1.Harry Potter Paperback Boxed Set, Books 1-5","2.Harry Potter Boxset (Harry Potter, #1-7)","3.Harry Potter Hardcover Boxed Set, Books 1-6","4.The Harry Potter Collection","5.Harry Potter and the Deathly Hallows","6.The Hogwarts Library","7.Harry Potter and the Order of the Phoenix","8.Harry Potter and the Half-Blood Prince","9.Harry Potter and the Goblet of Fire","10.Harry Potter and the Prisoner of Azkaban","11.Harry Potter and the Order of the Phoenix","12.Harry Potter and the Sorcerer's Stone","13.Harry Potter and the Chamber of Secrets"};
            for(i=0;i<13;i++)
            {
                System.out.println(rowling[i]);
                
            }
            System.out.println("These are the books written by J.K.Rowling which are present in our library.");
        }
        if(ch==7)
        {
            String dickens[]={"1.Great Expectations","2.David Copperfield","3.A Tale of Two Cities","4.Bleak House","5.Oliver Twist","6.A Christmas Carol","7.Little Dorrit","8.Our Mutual Friend","9.Nicholas Nickleby","10.The Pickwick Papers ","11.Dombey and Son", "12.Hard Times","13.The Old Curiosity Shop","14.Martin Chuzzlewit","15.Barnaby Rudge","16.The Mystery of Edwin Drood ","17.Great Expectations","18.The Signalman and The Ghost at the Trial","19.Christmas Stories and Related Tales", "20.The Chimes","21.The Cricket on the Hearth","22.The Haunted Man","23.Sketches by Boz","24.A Child's History of England", "25.Bleak House","26.David Copperfield ","27.Little Dorrit","28.The Posthumous Papers of the Pickwick Club I","29.The Magic Fish-bone"};

            for(i=0;i<29;i++)
            {
                System.out.println(dickens[i]);
                
            }
            System.out.println("These are the books written by Charles Dickens which are present in our library.");
        } 
        if(ch<1 || ch>7)
        {
            System.out.println("Incorrect choice.");
        }

        System.out.println("Enter 0 to Exit the terminal window and 1 to go to the main window.");
        int ch2=in.nextInt();
        if(ch2==0)
        {
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){}
            System.exit(0);
        }
        if(ch2==1)
        {
            library_management ob=new library_management();
            ob.main();
        }
        else
        {
            System.out.println("Incorrect choice.");
        }

    }
}
