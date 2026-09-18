public class SortedArray {
    public static void main(String[] args) {

        //   [    Q43. Chech Array Is Sorted OR Not    ]


    int[] arr = ArrayUtility.inputArray();
    boolean increasing = isAscending(arr);
    boolean decreasing = isDescending(arr);
      if (increasing){
          System.out.println(" Your Array Is Sorted In Increasing Order ");
        } 
      else if (decreasing){
          System.out.println(" Your Array Is Sorted In Decreasing Order ");
        }
      else{
        System.out.println(" Your Array Is Not Sorted ");
      }
    }
    public static boolean isAscending( int[] arr) {
       int i =1; 
       while(i<arr.length){
        if(arr[i]<arr[i-1]){
            return false;
        }
        i++;
       }
        return true;
    }
    public static boolean isDescending( int[] arr) {
        int i = 1; 
        while(i<arr.length){
        if(arr[i]>arr[i-1]){
            return false;
        }
        i++;
       }
        return true;
    }
    
}
