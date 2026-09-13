import java.util.Scanner;
public class ArrayUtility{
public static int[] inputArray(){
    Scanner input =new Scanner(System.in);
    System.out.print("\n\n ENTER THE NO. OF ELEMENT : ");
    int size =input.nextInt();
    int[] arr = new int [size];
    int i =0;
    while (i<size) {
        System.out.print(" Enter The Element No. "+(i+1)+" : "); 
        arr[i] =input.nextInt();
        i++;
      }
    return arr;
    }
}