import java.util.Scanner;
public class ArraySumchallenge {
    public static void main(String[] args) {

        // find sum and average of all elements in an array.

        Scanner input = new Scanner(System.in);
        System.out.print("\n please enter the no. of element : ");
            int size = input.nextInt();
            int[] nums = new int[size];
            int i=0;
            double sum =0;
            while (i < size) {
                System.out.print("\n Please enter element no. "+(i+1)+" : "); 
                int a=input.nextInt();
                sum = sum + a ;
                i++;
              }
            double average =  sum/i;
            System.out.print("\n THE SUM OF ALL ELEMENTS IN ARRAY IS : "+sum);
            System.out.print(" \nAVERAGE OF ALL ELEMENTS IN ARRAY IS : "+average);
    }
}
