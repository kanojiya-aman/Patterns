package patterns;

import java.util.Scanner;

public class Reverserighthalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int i,j;
        for(i=1; i<=n; i++){ //for rows
            for(j=n; j>=i; j--){ // for columns
                System.out.print("*"+" "); // " " for adding spaces btw the stars 
            }
            System.out.println(); // for next line
        }
        sc.close();
    }
}

/*
 
n = 5

* * * * *
* * * *
* * *
* *
*

 */
