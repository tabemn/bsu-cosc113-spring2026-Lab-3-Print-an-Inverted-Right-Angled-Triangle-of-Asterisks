import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {

        // 1. Setting up the Scanner tool

        Scanner input = new Scanner(System.in);

        // 2. Taking input from a user by asking the user for the triangle's height 

        System.out.print("Enter a positive integer for the triangle's height: ");
        int height = input.nextInt();

        System.out.println("\nInverted Right Triangle:");

        // 3. The outer loop handles the rows which starts at the top and goes down

        for (int i = height; i >= 1; i--) {
            
           // The inner loop handles printing the stars for that specific row

           for (int j = 1; j <= i; j++) {
                System.out.print("* ");
           }
            
            // Move to the next line after finishing a row

            System.out.println();
        }

        // Close the scanner
        
        input.close();
    }
}