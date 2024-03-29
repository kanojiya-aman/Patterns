package patterns;

import java.util.Scanner;

public class Squarefill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines(n) :");
        int n = sc.nextInt();
        int i,j;
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}