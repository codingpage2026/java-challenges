import java.util.Scanner;
public class ArrayOccurrences {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       int[] numArray = ArrayUtility.inputArray();
       System.out.print(" Now Enter The You Want To Find : ");
       int num =input.nextInt();
       int occurrence = noOfOccurrence(numArray, num);
       System.out.println(" Your element was found "+occurrence+" times in the Array");
    }
    public static int  noOfOccurrence(int[] numArray , int num) {
        int occ =0;
        int i =0;
        while (i<numArray.length) {
            if(numArray[i]==num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
