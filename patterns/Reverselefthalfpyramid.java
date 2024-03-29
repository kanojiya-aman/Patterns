package patterns;

import java.util.Scanner;

public class Reverselefthalfpyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n :");
        int n = sc.nextInt();

        int i,j,k;  

        for(i = 1; i<=n; i++){ //for rows

            for(j = n; j>=i; j--){ //for columns
                System.out.print("*"); // for printing stars
            }

            System.out.println(); // for next line

            for(k =1; k<=i; k++ ){ // for spaces
            System.out.print(" "); // for adding spaces 
            }
        }
        sc.close();
    }
}

/*
 
n = 5

*****
 ****
  ***
   **
    *
 
 */
