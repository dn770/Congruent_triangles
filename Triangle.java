// Task 11 question 1: The class "Traingle".
// The author: Netanel Dahan.
//******************************************
// The Triangle class calculates and prints the perimeter and the area of a triangle,
// according to the length of the sides that the user enters,
// using the Heron formula.

import java.util.Scanner;

public class Triangle 
{
    //The class "Triangle" receives three values of side lengths from the user.
    //Checks the correctness of the input - positive values,
    // and existence principle of equality triangle.
    //In case the input is correct - calculate and print the perimeter of the triangle,
    // and its area according to the Heron formula.
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in) ;

        System.out.println ("This program calculates the area " 
            + "and the perimeter of a given triangle. ");

        //Obtaining the lengths of the three sides of the triangle from the user.    
        System.out.println ("Please enter the three lengths"
            + " of the triangle's sides.") ;
        int a = scan.nextInt();// First side
        int b = scan.nextInt();// Second side
        int c = scan.nextInt(); // third side

        System.out.println ("The sides lengths of your triangle are "
            + a + ", " + b + ", " + c + ".");

        // Checking the correctness of the input.
        if (a<=0||b<=0||c<=0) // All lengths of sides must be positive.
            System.out.println ("Your triangle is illegal.\n" +
                "All Sides lengths must be positive.") ;
        else if (a+b<=c||a+c<=b||b+c<=a) // Triangle inequality compliance testing.
            System.out.println ("Your triangle is illegal.\n" +
                "The sides lengths of the triangle must comply with " +
                "the principle of triangle inequality.") ;

        else { // Legal traingle.
            int perimeter= a+b+c ;//Calculate the perimeter of the triangle.

            //Calculates the area of the triangle,
            //Using the Heron formula by auxiliary variables.
            double s = ((double) perimeter) / 2 ;
            double heron = s*(s-a)*(s-b)*(s-c) ;
            double area = Math.sqrt(heron);

            //Prints the calculation conclusion.
            System.out.println ("The perimeter of your triangle is "
                + perimeter + ".");
            System.out.println ("The area of your triangle is " 
                + area + "." );

        } // end of 'else' block
    } // end of method main
} // end of class Triangle
 