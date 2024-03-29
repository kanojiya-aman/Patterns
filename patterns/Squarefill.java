package patterns;

import java.util.Scanner;

public class Squarefill {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the number of lines (n) for the square
        System.out.println("Enter number of lines(n) :");
        
        // Reading the number of lines from the user
        int n = sc.nextInt();
        
        // Variables to iterate through rows and columns
        int i, j;
        
        // Loop to iterate through each row
        for(i = 1; i <= n; i++) {
            // Loop to iterate through each column in the current row
            for(j = 1; j <= n; j++) {
                // Printing '*' followed by a space to create the pattern
                System.out.print("*" + " ");
            }
            // Moving to the next line to start a new row
            System.out.println();
        }
        
        // Closing the Scanner object to prevent resource leak
        sc.close();
    }
}

