import java.util.Scanner;
public class Palindrome_challenge {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.print("\n ENTER YOUR NUMBER : ");
        int input=x.nextInt();
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome){
        System.out.println("REVERSE = "+ reverse(input));
        System.out.println(" \nYOUR NUMBER IS A PALINDROME NUMBER \n BECAUSE : *** REVERSE = GIVEN NUMBER ***");
        }else{
        System.out.println("REVERSE = "+ reverse(input));
        System.out.println(" \nYOUR NUMBER IS NOT A PALINDROME NUMBER \n BECAUSE : *** REVERSE of given no. is not equal to GIVEN NUMBER ***\"");
        }
    }
       public static boolean isPalindrome(int input){
        int reverse = reverse(input);
        return input == reverse;
       }
       
       public static int reverse(int input){
        int newInput =0;
        while (input>0) {
            int digit =input % 10;
            newInput=newInput*10 +digit;
            input/=10;  
        }
        return newInput;
       }
}