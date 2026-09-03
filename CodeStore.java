public class CodeStore {
    public static void main(String[] args) {
         

/*                                         CODE 1 [ for simple print ]
     

   System.out.println("hello yash");
    

                                            CODE 2 [ Pyramid pattern ]
    

   System.out.println("*     *       *");
   System.out.println("          *     *       *");
   System.out.println("*    *              ");


                                            CODE 3 [ DATA TYPE ]


    IMP NOTE : DON'T use DOUBLE QUOTE SYMBOL [ "" ] in system.out.println("");    

   int myNumber = 20;
   System.out.println(myNumber);

NOTE : In float if we use decimal it shows error so we put small [f] in the END  

   float myFloat = 22.2548f;
   System.out.println(myFloat);
   double myDouble = 9.75456;
   System.out.println(myDouble);
   boolean isCat = true ;
   System.out.println(isCat);

NOTE : In String after equal to we use [ "" ]

   String wish = "good morning";
   System.out.println(wish);
                                           

                                            CODE 4 [ Escape Sequences ]
                                             
                                  
   System.out.println("my\tWorld");
   System.out.println("y\bashmishra");
   System.out.println("MY NAME IS \nYASH");
   System.out.println("\"yash\""); 
   System.out.println("\\yashmishra\\");


                                            CODE 5 [ pyramid pattern using single print ststement ]


   System.out.println("*\n* *\n* * *\n* * * *\n* * * * *");
   System.out.println("* * * * *\n* * * *\n* * *\n* *\n*");
   System.out.println("        *\n      * *\n    * * *\n  * * * *\n* * * * *");



                                            CODE 6 [ USER INPUT ]


    
  [     NEW CREATED BY ME      ]
      Scanner userinput791Scanner = new Scanner(System.in);


    System.out.print("HELLO PLEASE ENTER YOUR NAME BABY: ");
    String input791s = userinput791Scanner.nextLine();

    System.out.print(input791s + " ENTER YOUR AGE BABY: ");
    int AGE719g = userinput791Scanner.nextInt();
    
    System.out.print("HELLO "+ input791s );
    System.out.print(" PLEASE ENTER YOUR HUSBAND NAME: ");
    String husbandname719s = userinput791Scanner.next();
     
   System.out.print(input791s+" PLEASE ENTER YOUR HUSBAND "+ husbandname719s);
    System.out.print(" AGE: ");
    int husbandage719g = userinput791Scanner.nextInt();


                                            CODE 7  [   ADD TWO NUMBERS WITH USER INPUT  ]
  
                                            
    Scanner userinput792Scanner = new Scanner(System.in);
    System.out.print("ENTER YOUR FIRST NUMBER593: ");
    int myNumber593n = userinput792Scanner.nextInt();

    System.out.print("ENTER YOUR SECOND NUMBER876: ");
    int myNumber876n = userinput792Scanner.nextInt();
         
    int sum9909s = myNumber593n + myNumber876n;
    System.out.println("THE SUM OF TWO NUMBERS :  " + sum9909s);


                                            CODE 8  [   SWAP TWO NUMBERS WITH USER INPUT  ]

                                            
   Scanner Swapinput = new Scanner(System.in);

    System.out.print("ENTER FIRST NUMBER A: ");
    int a = Swapinput.nextInt();
    System.out.print("ENTER SECOND NUMBER B: ");
    int b = Swapinput.nextInt(); 

    int c = a; 
    a = b;
    b = c;
    System.out.println("A: "+ a );
    System.out.println("B: "+ b);                                            


                                            CODE 9  [  CALCULATER TO [+,-,*,/,%] TWO NUMBER WITH USER INPUT  ]

 
   Scanner input = new Scanner(System.in);
   System.out.print("ENTER FIRST NUMBER: "); 
   double a = input.nextDouble();
   System.out.print("ENTER SECOND NUMBER: ");
   double b = input.nextDouble();

   double sum = a+b;
   double multiply = a*b;
   double divide = a/b;
   double subtrat = a-b;
   double remainder = a%b;

   System.out.println("sum: "+sum);
   System.out.println("multiply: "+multiply);
   System.out.println("divide: "+divide);
   System.out.println("subtrat: "+subtrat);
   System.out.println("remainder: "+remainder);


                                            CODE 10 [ PERIMETER OF RECTANGEL  ]


    Scanner inpt = new Scanner(System.in);
    System.out.print("enter length OF RECTANGEL: ");
    double a= inpt.nextDouble();
    System.out.print("enter breadth OF RECTANGEL: ");
    double b = inpt.nextDouble();
    double x = 2*(a+b);
    System.out.print("PERIMETER OF RECTANGEL: "+x);


                                            CODE 11 [  AREA OF A TRIANGLE  ]


       Scanner x = new Scanner(System.in);
       System.out.print(" enter breadth of a triangle : ");
       double a = x.nextDouble();
       System.out.print(" enter height of a triangle : ");
       double b = x.nextDouble();
       double c = 0.5*(a*b);
       System.out.print("AREA OF A TRIANGLE: "+c);


                                            CODE 12 [ CALCULATE SIMPLE INTEREST ]


    Scanner m = new Scanner(System.in);
    System.out.print("Principal amount (P)= ");
    double a = m.nextDouble();
    System.out.print("Rate of interest per year (R)= ");
    double b = m.nextDouble();
    System.out.print("Time period (T)= ");
    double c =m.nextDouble();
    double x = (a*b*c)/100;
    System.out.print(" SIMPLE INTEREST : "+ x);


                                            CODE 13 [ CALCULATE COMPOUND INTEREST ]


    Scanner m = new Scanner(System.in);
    System.out.print("Principal amount (P)= ");
    double a = m.nextDouble();
    System.out.print("Rate of interest per year (R)= ");
    double b = m.nextDouble();
    System.out.print("Time period (T)= ");
    double c =m.nextDouble();
    double x = a * Math.pow((1+ b/100),c);
    System.out.print(" COMPOUND INTEREST : "+ x );   
    
    
                                            CODE 14 [ CONVERT Degree Fahrenheit INTO Degree Celsius ]    


    Scanner x = new Scanner(System.in);
    System.out.print(" enter value of Degree Fahrenheit : ");
    double b = x.nextDouble();
    double c = (b - 32)*5/9;
    System.out.print("DEGREE CELSIUS: "+c);


                                            CODE 15 [ CHECK NO. IS POSITIVE, NEGATIVE,OR ZERO WITH USER INPUT ]


    Scanner x = new Scanner(System.in);

        System.out.print("ENTER YOUR NUMBER : ");

        Double a = x.nextDouble();

        if (a>0) {

            System.out.println("GIVEN NUMBER IS POSITIVE ");            

        } else if (a<0) {

            System.out.println("GIVEN NUMBER IS NEGATIVE ");

        } else {

            System.out.println("GIVEN NUMBER IS ZERO ");

        }


                                            CODE 16 [  CHECK NO. IS EVEN OR ODD WITH USER INPUT  ]
   

     Scanner x = new Scanner(System.in);

     System.out.print("ENTER OUR NUMBER : ");

     int a = x.nextInt();

     if (a%2 == 0) {

         System.out.println("GIVEN NUMBER IS EVEN ");

     } else{

         System.out.println("GIVEN NUMBER IS ODD ");}

    
                                            CODE 17 [ CHECK WHICH NO. IS GREATEST  ]


   Scanner x = new Scanner(System.in);

       System.out.print("ENTER 1ST NUMBER : ");

       double a = x.nextDouble();

       System.out.print("ENTER 2ND NUMBER : ");

       double b = x.nextDouble();

       System.out.print("ENTER 3RD NUMBER : ");

       double c = x.nextDouble();

       if (a>=b&&a>=c) {

       System.out.print(a+ " IS GREATEST NO. ");

       }

       else if (b>=a&&b>=c) {

       System.out.println(b+ " IS GREATEST NO. "); 

       } else{

       System.out.println(c+ " IS GREATEST NO. ");}


                                            CODE 18 [ CHECK LEAP YEAR WITH USER INPUT ]


        Scanner x = new Scanner(System.in);

        System.out.print("ENTER YEAR YOU WANT TO CHECK : ");

        int a = x.nextInt();

        if (a%400==0) {

            System.out.println(a+ " IS LEAP YAER");

        } else if (a%100==0) {

            System.out.println(a+ " IS NOT LEAP YAER");

        } else if (a%4==0) {

            System.out.println(a+ " IS LEAP YAER");

        } else {

            System.out.println(a+ " IS NOT LEAP YAER");}


                                            CODE 19 [ CALCULATE GRADES BASED ON MARKS WITH USER INPUT ]


        Scanner x = new Scanner(System.in);

        System.out.print("ENTER YOUR MARK (WITHOUT PERCENTAGE SIGN) : ");

        Double a = x.nextDouble();

        if (a>=90) {

            System.out.println("YOUR GRADE IS A ");

        } else if (a>=75) {

            System.out.println("YOUR GRADE IS B ");

        } else if (a>=60) {

            System.out.println("YOUR GRADE IS C ");

        } else if (a>=30) {

            System.out.println("YOUR GRADE IS D ");

        } else if (a<=30) {

            System.out.println("YOUR GRADE IS F ");}


                                            CODE 20 [ CATEGORIZE A PERSON INTO DIFFERENT AGE GROUPS ]


       Scanner x = new Scanner(System.in);

       System.out.print("please enter your age : ");

       int a = x.nextInt();

       if (a<=13) {

        System.out.println("CATEGORIZE: CHILD ");

       } else if (a<=20) {

        System.out.println("CATEGORIZE: CHILD ");

       } else if (a<=60) {

        System.out.println("CATEGORIZE: ADULT ");

       } else{

        System.out.println("CATEGORIZE: SENIOR ");}


                                            CODE 21 [ bitwise AND , OR, XOR, NOT , Left shift , Right shift {&&,||,^,~,<<,>>} ]


     Scanner x = new Scanner(System.in);

    System.out.print("enter 1st no: ");

    int a = x.nextInt();

    System.out.print("enter 2nd no: ");

    int b = x.nextInt();

    int m = a&b;

    System.out.print("bitwise AND OF two no. is " +m);



  Scanner x = new Scanner(System.in);

    System.out.print("enter 1st no: ");

    int a = x.nextInt();

    System.out.print("enter 2nd no: ");

    int b = x.nextInt();

    int m = a|b;

    System.out.print("bitwise OR of two no. is " +m);



 Scanner x = new Scanner(System.in);

    System.out.print("enter 1st no: ");

    int a = x.nextInt();

    System.out.print("enter 2nd no: ");

    int b = x.nextInt();

    int m = a^b;

    System.out.print("bitwise XOR of two no. is " +m);



 Scanner x = new Scanner(System.in);

    NOTE IMP : it shows negative sign bcz. intrger 4 byte ke hote hai toh usske aage 111... aajata hai woh -ve sign show karta hai

    System.out.print("enter 1st no: ");

    int a = x.nextInt();

    System.out.print("enter 2nd no: ");

    int b = x.nextInt();

    int m = ~b;

    int n = ~a;

    System.out.println("bitwise NOT OPERATOR / COMPLEMENT OPERATOR of 1ST no. is " +n);

    System.out.println("bitwise NOT OPERATOR / COMPLEMENT OPERATOR of 2nd no. is " +m);



 Scanner x = new Scanner(System.in);
      
     System.out.print("enter 1st no: ");

     int a = x.nextInt();

     int number = a<<1;

     System.out.println("1st no. after left shift : " + number );

     System.out.print("\nenter 2nd no: ");

     int b = x.nextInt();

     int m = b>>1;

     System.out.print("2nd no. after Right shift : " +m);


                                            CODE 22 [ check given is even or odd with bitwise program ]


     Scanner x = new Scanner(System.in);

     System.out.print("enter 1st no: ");

     int a = x.nextInt();

     int abc = a&1;

     if (abc == 0) {

        System.out.println(a+ " IS EVEN no. ");

     } else {

        System.out.println(a+" IS ODD no. ");

     }


                                            // CODE 23 [ while loop ka use  ]



      int z;
      int i=0;
      int b = 2;
      int a = 1;
       Scanner x = new Scanner(System.in);

          while (i <= 1000){
            b=2;
             System.out.print(" \nYOU LOVE ME ? \n 1) YES\n 2) NO \n( 1 OR 2 ) :   ");
             z = x.nextInt();
             while (z==a) { 
                  System.out.println("\n**********************************");
        System.out.println("Tum sirf meri mohabbat nahi,\r\n" + //
                        "meri zindagi ka woh khoobsurat hissa ho,\r\n" + //
                        "jiske bina sab kuch hote hue bhi,\r\n" + //
                        "jaise kuch adhura sa lagta hai… \r\n" + //
                        "\r\n" + //
                        "Tumhari ek muskurahat meri khushi hai,\r\n" + //
                        "tumhari ek khamoshi meri fikr hai,\r\n" + //
                        "tumhari aankhon mein jo sapne hain,\r\n" + //
                        "un sapno mein apna naam dekhna meri sabse badi khwahish hai \r\n" + //
                        "\r\n" + //
                        "Main tumse sirf aaj pyaar nahi karta,\r\n" + //
                        "main tumhare saath apna kal dekhna chahta hoon,\r\n" + //
                        "tumhare haath ko sirf pakadna nahi,\r\n" + //
                        "zindagi bhar usse thaam kar rakhna chahta hoon \r\n" + //
                        "\r\n" + //
                        "Aur haan...\r\n" + //
                        "tumhare saath sirf tum nahi ho,\r\n" + //
                        "tumhare saath tumhari **Mummy aur Papa** bhi hain,\r\n" + //
                        "aur sach kahun toh,\r\n" + //
                        "un dono ki izzat mere liye tumhari mohabbat jitni hi zaroori hai. \r\n" + //
                        "\r\n" + //
                        "Tumhari Mummy ki mamta ko,\r\n" + //
                        "main kabhi kam nahi hone dunga,\r\n" + //
                        "unhone tumhe jis pyaar se sambhala hai,\r\n" + //
                        "us pyaar ki hamesha izzat karunga.\r\n" + //
                        "\r\n" + //
                        "Tumhare Papa ne tumhe jis himmat se bada kiya hai,\r\n" + //
                        "unke bharose ko kabhi tootne nahi dunga,\r\n" + //
                        "unke saamne sirf tumhara haath maangunga nahi,\r\n" + //
                        "balki yeh wada bhi karunga\r\n" + //
                        "ki tumhari khushi ko apni zimmedari samjhunga. \r\n" + //
                        "\r\n" + //
                        "Agar kabhi tum rogi,\r\n" + //
                        "toh wajah poochne se pehle tumhare aansu pochunga,\r\n" + //
                        "agar kabhi tum thak jaogi,\r\n" + //
                        "toh tumhe sambhalne ke liye tumhare paas khada rahunga.\r\n" + //
                        "\r\n" + //
                        "Aur agar kabhi tumhare Mummy-Papa ko\r\n" + //
                        "meri zarurat padegi,\r\n" + //
                        "toh main sirf tumhara nahi,\r\n" + //
                        "**un dono ka bhi apna bankar khada rahunga.** \r\n" + //
                        "\r\n" + //
                        "Mujhe tumse sirf ishq nahi hai,\r\n" + //
                        "mujhe tumhari poori duniya se mohabbat hai,\r\n" + //
                        "tumhari aadaton se,\r\n" + //
                        "tumhari narazgiyon se,\r\n" + //
                        "tumhari bachkani baaton se,\r\n" + //
                        "tumhari khamoshiyon se,\r\n" + //
                        "aur un logon se bhi\r\n" + //
                        "jinhone tumhe itna khoobsurat insaan banaya hai\r\n" + //
                        "\r\n" + //
                        "Main wada toh bade-bade nahi karunga,\r\n" + //
                        "bas itna kehna chahta hoon\r\n" + //
                        "jab tak meri saansein chalengi,\r\n" + //
                        "tumhari izzat meri pehli zimmedari hogi,\r\n" + //
                        "tumhari khushi meri dua hogi,\r\n" + //
                        "aur tumhara saath meri sabse khoobsurat kismat. \r\n" + //
                        "\r\n" + //
                        "Kabhi zindagi mein mushkilein aayengi,\r\n" + //
                        "kabhi hum dono ke beech narazgi hogi,\r\n" + //
                        "kabhi waqt humare khilaaf hoga,\r\n" + //
                        "lekin main tumhara haath chhodne walon mein se nahi hoon.\r\n" + //
                        "\r\n" + //
                        "Main tumhare saath\r\n" + //
                        "sirf achhe waqt mein nahi,\r\n" + //
                        "bure waqt mein bhi rehna chahta hoon.\r\n" + //
                        "\r\n" + //
                        "Tumhari Mummy ki duaon mein,\r\n" + //
                        "tumhare Papa ke bharose mein,\r\n" + //
                        "aur tumhari aankhon ke sapno mein\r\n" + //
                        "apne aap ko dekhna chahta hoon\r\n" + //
                        "\r\n" + //
                        "Aur ek din...\r\n" + //
                        "jab tumhare Papa mujhe dekhkar\r\n" + //
                        "dil se keh sakein,\r\n" + //
                        "** Maine apni beti ka haath sahi insaan ke haath mein diya hai, **\r\n" + //
                        "aur tumhari Mummy ki aankhon mein\r\n" + //
                        "mere liye apne bete jaisa pyaar ho \r\n" + //
                        "\r\n" + //
                        "Us din shayad\r\n" + //
                        "meri mohabbat ko apni sabse khoobsurat manzil mil jayegi. \r\n" + //
                        "\r\n" + //
                        "Kyuki mujhe tumhe sirf paana nahi hai,\r\n" + //
                        "**  mujhe tumhe sambhalna hai.  **\r\n" + //
                        "\r\n" + //
                        "Mujhe tumhare saath sirf\r\n" + //
                        "kuch khoobsurat pal nahi jeene,\r\n" + //
                        "balki poori zindagi jeeni hai.\r\n" + //
                        "\r\n" + //
                        "Tum meri mohabbat ho,\r\n" + //
                        "tum meri dua ho,\r\n" + //
                        "tum meri khushi ho,\r\n" + //
                        "aur agar kismat ne saath diya\r\n" + //
                        "\r\n" + //
                        "Toh ek din\r\n" + //
                        "** tum meri zindagi ki woh kahani banogi,\r\n" + //
                        "jisme tumhari Mummy-Papa ki duaayein hongi,\r\n" + //
                        "tumhara haath mere haath mein hoga,\r\n" + //
                        "aur hum dono milkar kahenge....\r\n" + //
                        "Humne ek doosre ko sirf chaha nahi,\r\n" + //
                        "balki poori zindagi nibhaya hai.** \r\n" + //
                        "");
            System.out.println(" I LOVE YOU SO MUCH  ");
            System.out.println("**********************************");
            a=10;
            i=1000;
             }   
              while( z == b){
            System.out.print(" \n******* EK BAAR '1' SELECT KARLO EK BAAR BSS *******\n");
            b=1;}
            i++;
           } 
      }
    }



                                            CODE 24 [    multiplication table using while loop     ]



        Scanner x = new Scanner(System.in);
        System.out.println("\n ****** multiplication table (1 to 10,00,00,000) ******\n");
        System.out.print(" ENTER THE NUMBER : ");
         int a= x.nextInt();
         int i =1;

         while (i<=10){ 
            int m =i*a;
            System.out.println("\t\t"+ a +" x "+ i +" = "+m);
            i++;
      }



                                            CODE 25 [  SUM OF ALL ODD NO. FROM 1 TO N   ]



      System.out.println("\n****** SUM OF ALL ODD NO. FROM 1 TO N ******\n");
       int n= readNumber();
       int sum = oddSum(n);
       System.out.println(" all odd sum till "+ n +" is "+ sum);

   }
       public  static int oddSum(int n) {
        int sum =0;
        int i=1;
        while (i<=n) { 
               sum = sum +i;
        i+=2;}
         return sum;
       }

      public static int readNumber() {
        Scanner x = new Scanner(System.in);
        System.out.print(" ENTER THE NUMBER (N) : ");
         int inputvalue = x.nextInt();
         return inputvalue;
      }



                                            CODE 26 [  calculate the factorial of given number (N)   ]



           System.out.println("\n***** calculate the factorial of given number (N)*****\n");      
           int n = readNumber();
           long factorial = nfactorial(n);
          System.out.println("the value of "+ n +"! is : "+ factorial);
     
   }
        public  static long  nfactorial(int n) {
         if (n<2){
            return 1;
         }
        int i=2;
        long factorial = 1;
        while (i<=n) { 
             factorial = factorial*i;
        i++;}
         return factorial;
       }

      public static int readNumber() {
        Scanner x = new Scanner(System.in);
        System.out.print(" ENTER THE NUMBER (N) : ");
         int inputvalue = x.nextInt();
         return inputvalue;
      }



                                            CODE 27 [ SUM OF TWO NO. USING METHOD / FUNCTIONS ]



    int first = readNumber();
    int second = readNumber();
    int sum = sumNumbers(first, second);
     System.out.println("\n\n the first numbers is : "+first);
      System.out.println(" the second numbers is : "+ second);
    System.out.println(" the Sum of numbers is : "+sum);
      
} 
    public static int sumNumbers(int first , int second){
           int sum = first + second;
      return sum; 
    }

     public static int readNumber() {
        Scanner x = new Scanner(System.in);
        System.out.print("\n ENTER THE NUMBER : ");
         int inputvalue = x.nextInt();
         return inputvalue;
      }



                                            CODE 28 [ LCM OF TWO NUMBERS ]



          int first=readNumber();
          int second=readNumber();
          int lcm=lcmValue(first, second);
          System.out.println("\n\n  the first no. is "+first);
          System.out.println("  the second no. is "+second);
          System.out.println("  the LCM (LEAST COMMON MULTIPLE) of two no. is : "+lcm);
     }
        public static int lcmValue(int first , int second){
          int i = 1;
          int a=first*second;
          int lcm =1;
          while (i<=a) { 
              int b= first*i;
              while (b%second==0) { 
                  lcm =b;
                  return lcm;
              }
              i++;} return 0;
        }
        public static int readNumber() {
        Scanner x = new Scanner(System.in);
        System.out.print("\n ENTER THE NUMBER : ");
         int inputvalue = x.nextInt();
         return inputvalue;
      }
}


                                            CODE 29 [    the sum of digits    ] 



          int first=readNumber();
          int sum =digitSum(first);
          System.out.println("\n\n  the no. is "+first);
          System.out.println("  the sum of digits is : "+sum);

     }
          public static int digitSum(int first){
     int a=first;
     int b;
     int sum=0;
            while (a >0) { 
               b=a%10;
               sum= sum + b;
                a=a/10; 
          } 
          return sum;
        }

          public static int readNumber() {
          Scanner x = new Scanner(System.in);
          System.out.print("\n ENTER THE NUMBER : ");
          int inputvalue = x.nextInt();
          return inputvalue;
      }   


                                            CODE 30 [   the GCD (GREATEST COMMON DIVISOR) of two no.   ]



         int first=readNumber();
          int second=readNumber();
          int gcd=gcdValue(first, second);
          System.out.println("\n\n  the first no. is "+first);
          System.out.println("  the second no. is "+second);
          System.out.println("  the GCD (GREATEST COMMON DIVISOR) of two no. is : "+gcd);
     }
        public static int gcdValue(int first , int second){
          int i = small(first, second);
          int a;
          int b;
          int gcd=1 ;
          while (i>=2) { 
               a =  first%i;
               b= second%i;
             if (a==0 && b==0) { 
                 gcd =i;
             }i--;
          }    
              return gcd;
        }
        public static int small(int first, int second){
          if (first>second){
               return second;
          }else {
          return first;
           }
        }
        public static int readNumber() {
        Scanner x = new Scanner(System.in);
        System.out.print("\n ENTER THE NUMBER : ");
         int inputvalue = x.nextInt();
         return inputvalue;
     }
                                        
     
                                            CODE 31 [   check no. is prime or not    ]



      int first=readNumber();
          int prime=primeValue(first);
     }
      public static int primeValue(int first){
          int i=1;
          int a=first;
          if (a==1) {
               System.out.println("it is not prime no.");
               return 0;
          }
          while(a>=2){
               a=first-i;
             if (first%a==0 && a>1) {
                 System.out.println("the number is not prime number");
                 return 0;
             } 
         i++; }
         System.out.println("the no. is prime no.");
          return 0;
      }
          public static int readNumber() {
        Scanner x = new Scanner(System.in);
        System.out.print("\n ENTER THE NUMBER : ");
         int inputvalue = x.nextInt();
         return inputvalue;
     }



                                            CODE 32 [  reverse the digit of a no.  ]



        int first=readNumber();
          int reverse =digitReverse(first);
          System.out.println("\n\n  the no. is "+first);
          System.out.println("  the reverse of the digits of a no. is : "+reverse);

     }
          public static int digitReverse(int first){
     int b;
     int reverse=0;
            while (first >0) { 
               b=first%10;
               reverse += b;
                reverse*=10; 
                first/=10;
          } reverse/=10;
          return reverse;
        }

          public static int readNumber() {
          Scanner x = new Scanner(System.in);
          System.out.print("\n ENTER THE NUMBER : ");
          int inputvalue = x.nextInt();
          return inputvalue;
      }    



                     CODE 33 [ Fibonacci Series of a number {next no.=sum of last two (0,1,1,2,3,5,8,13,....)} ]



        int first=readNumber();
          int x = fibonacciSeries(first);

     }
          public static int fibonacciSeries(int first){
            System.out.println("Fibonacci Series of a number is ");
            int a=0;
            int b=1;
            int sum= a+b;
            while (first >(a|b)) { 
                b=a+b;
                System.out.print(  a +"  "+ b+"  " );
                a=a+b;
                
            }
            return 0;
        }

          public static int readNumber() {
          Scanner x = new Scanner(System.in);
          System.out.print("\n ENTER THE NUMBER : ");
          int inputvalue = x.nextInt();
          return inputvalue;
      }    



                                            CODE 34 [ ]









   */ }
}
