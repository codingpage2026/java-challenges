import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
      
//   CODE: [ Check the given no. is armstrong no. (OR) not ???? ]

    int first=readNumber();
    int sum =digitSum(first);
     }
    public static int digitSum(int first){
     int a=first;
     int b;
     int sum=0;
     int i=1;
            while (a >0) { 
               b=a%10;
               int c = (int) Math.pow(b, 3);
               sum= sum + c;
               System.out.println("(cubic)power of digit "+b+" is : "+c);
               if(sum==first){
                System.out.println("The sum of (cubic)power of all digit is : "+sum);
                System.out.println("\n\nthe given no. ("+first+") is armstrong number");
                System.out.println("BECAUSE : The sum of (cubic)power of all digit is equal to given no.");
                System.out.println("TOTAL NO. OF DIGIT IS : "+ i);
                return 0;
              }
                a=a/10; 
                i++;
          } i--;
          if(first==0){
          System.out.println("The sum of (cubic)power of all digit is : "+sum);
          System.out.println("\n\nthe given no. ("+first+") is armstrong no.");
          System.out.println("BECAUSE : The sum of (cubic)power of all digit is equal to given no.");
          System.out.println("\nTOTAL NO. OF DIGIT IS : 0");   
          return 0;
          }else
          System.out.println("The sum of (cubic)power of all digit is : "+sum);
          System.out.println("\n\nthe given no. ("+first+") is not armstrong no.");
          System.out.println("BECAUSE : The sum of (cubic)power of all digit is not equal to given no.");
          System.out.println("\nTOTAL NO. OF DIGIT IS : "+ i);   
          return 0;
        }
          public static int readNumber() {
          Scanner x = new Scanner(System.in);
          System.out.print("\n ENTER THE NUMBER : ");
          int inputvalue = x.nextInt();
          return inputvalue;
      } 
    }
      
    
