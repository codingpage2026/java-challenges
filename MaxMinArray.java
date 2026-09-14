public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int max = maxArray(arr);
        int min = minArray(arr);
        System.out.println("\n The Maximum Number In The Array Is : "+max);
        System.out.println(" The Minimun Number In The Array Is : "+min);
    }
    public static int maxArray(int[]arr){
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (max < arr[i]){
                max = arr[i];
            } 
            i++;
        }
       return max;
    }
    public static int minArray(int[]arr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (min > arr[i]){
                min = arr[i];
            } 
            i++;
        }
       return min;
    }
}
