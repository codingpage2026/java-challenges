import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args) {

//    CODE: [ Fibonacci Series of a number {next no.=sum of last two (0,1,1,2,3,5,8,13,....)} ]
      
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
}
