
import java.util.Scanner;

public class Pattern_challenge {
   public static void main(String[] args) { 
      int x=input();
      System.out.println("\n\n PRINT FIRST PATTERN  : \n");
         firstPattern(x);
      System.out.println("\n\n PRINT SECOND PATTERN  : \n");
         secondpattern(x);
      System.out.println("\n\n PRINT THIRD PATTERN  : \n");
         thirdpattern(x);
      System.out.println("\n\n PRINT FOURTH PATTERN  : \n");
         fourthpattern(x);
   } 
    public static void firstPattern(int x){
     int rows =0;
     while (rows < x){
        System.out.print("*");
        int i=0;
        while (i< rows) {
            System.out.print(" *");
            i++;
        }
        System.out.println();
        rows++;
       }
     }
    public static void secondpattern(int x){
      int rows =x;
      while (rows>0) {
         int i =0;
         while(i<rows){
            System.out.print(" *");
            i++;
         } 
          System.out.println();
          rows--;
      }
    }
    public static void thirdpattern(int x){
      int row =0;
      while (row<x){
         int j =x-1;
         while(j>=row){
            System.out.print(" ");
            j--;
         }
         int i=0;
         while (row>=i) { 
             System.out.print("* ");
             i++;
         }
         row++;
         System.out.println();
      }
    }
    public static void fourthpattern(int x){
      int row =x;
      while (row>0){
         int j =0;
         while(j<(row-1)){
            System.out.print(" ");
            j++;
         }
         int i=0;
         while (i<=(x-row)) { 
             System.out.print("*");
             i++;
         }
         System.out.println();
         row--;
      }
    }
    public static int input(){
      Scanner input = new Scanner(System.in);
      System.out.print("\nenter the no. of rows : ");
      int x =input.nextInt();
      return x;
    }
}