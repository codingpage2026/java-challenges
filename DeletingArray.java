import java.util.Scanner;
public class DeletingArray {
    public static void main(String[] args) {
        
        //    [   Q44. Return New Array After Deleting Specific Element ]
        

        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("\n Enter The Element You Want do delete : ");
        int num = input.nextInt();
        int[] newArray = Delete(arr, num);
        ArrayUtility.DisplayArray(newArray);
    }
    public static int[] Delete(int[] arr , int num) {
        int occ = ArrayOccurrences.noOfOccurrence(arr, num);
        if (occ==0) {
            System.out.println("\n The Elemnet You Want To Delete Is NOT Found \n SO THE ARRAY IS SAME ");
            return arr;
        }
        System.out.println("\n After Deleting The New Array Is ");
        int newSize =arr.length - occ;
        int[] newArray = new int[newSize];
        int i = 0 , j = 0;
        while (i<arr.length) { 
            if (arr[i] != num) {
                newArray[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArray ;
    }
}
