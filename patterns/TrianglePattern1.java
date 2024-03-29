package patterns; // Package declaration

import java.util.Scanner; // Importing Scanner class from java.util package

public class TrianglePattern1 { // Class declaration
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input from the user
        char choice; // Variable to store user's choice to continue or not
        
        do { // Start of do-while loop for continuous execution
            System.out.print("Enter n : "); // Prompting the user to enter the value of 'n'
            int n = sc.nextInt(); // Reading the value of 'n' from the user
            System.out.println(); // Moving to the next line
            
            int i, j; // Variables for iteration
            
            // Upper half of the triangle
            for (i = 1; i <= n; i++) { // Loop for rows
                for (j = 1; j <= i; j++) { // Loop for columns in each row
                    System.out.print("*" + " "); // Printing '*' characters followed by a space
                }
                System.out.println(); // Moving to the next line after printing each row
            }
    
            // Lower half of the triangle
            for (i = 1; i <= n; i++) { // Loop for rows
                for (j = n - 1; j >= i; j--) { // Loop for columns in each row
                    System.out.print("*" + " "); // Printing '*' characters followed by a space
                }
                System.out.println(); // Moving to the next line after printing each row
            }
    
            System.out.print("Do you want to continue? (y/n): "); // Prompting the user to continue or not
            choice = sc.next().charAt(0); // Reading the user's choice
            
        } while (choice == 'y' || choice == 'Y'); // Loop continues if user's choice is 'y' or 'Y'
        
        sc.close(); // Closing the Scanner object to prevent resource leak
    }
}

/*
 
n = 6


 */
