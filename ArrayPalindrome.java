public class ArrayPalindrome {
    public static void main(String[] args) {
        
        //    [ Q46.  Check Array is Palindrome Array OR Not ]

        int[] arr = ArrayUtility.inputArray();
        int[] swapArray = arr;
        Reverse(arr);
        System.out.println("\n\n  ****REVERSE OF THE ARRAY IS****   ");
        ArrayUtility.DisplayArray(arr);
        System.out.println("\n");
        boolean check = Check(arr,swapArray);
        if (check) {
            System.out.println(" Array is Palindrome Array \n BECAUSE : *** ARRAY =   REVERSE OF ARRAY *** ");
        } else {
            System.out.println(" Array is Not Palindrome Array\n BECAUSE : *** ARRAY is not equal to REVERSE OF ARRAY ***");
        }
    }
    public static boolean Check(int[]arr ,int[]swapArray){
        int i = 0;
        while (arr.length>i) { 
            if (arr[i]!=swapArray[i]) {
               return false;
            }
            i++;
        }
        return true;
    }
    public static int[] Reverse(int[]arr){
        int i =0;
        while ((arr.length/2)>i) { 
            int Swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = Swap;
            i++;
        }
        return arr;
    }
}
