package patterns;

import java.util.Scanner;

public class Lefthalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int i, j, k;
        
        for(i = 1; i <= n; i++) {
            // Printing spaces before the '*' characters
            for(j = n; j > i; j--) {
                System.out.print(" "+" ");
            }
            
            // Printing '*' characters
            for(k = 1; k <= i; k++) {
                System.out.print("*"+" ");
            }
            
            // Moving to the next line
            System.out.println();
        }
        sc.close();
    }
}

/*

   n = 6

          *
        * *
      * * *
    * * * * 
  * * * * *
* * * * * *


 */
