public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
      reverse(arr);
      System.out.println("\n\n YOUR ARRAY IS REVERSED ");
      ArrayUtility.DisplayArray(arr);
    }
    public static int[] reverse(int[]arr) {
        int i = 0;
        while((arr.length/2)>i){
          int swap = arr[i];
          arr[i] = arr[(arr.length -1)- i];
          arr[(arr.length -1)-i] = swap ;
          i++;
        }
         return arr ;
    }
  }
