package patterns;

import java.util.Scanner;

public class TrianglePattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Upper half of the triangle
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            // Print '*' characters
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower half of the triangle
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            // Print '*' characters
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
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
  * * * * * 
    * * * * 
      * * * 
        * * 
          * 

 */