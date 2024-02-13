// Task 11 question 1: The class "Congruent".
// The author: Netanel Dahan.
//******************************************
// The Congruent class determines whether two triangles are congruent,
// Through the congruenting sentence "SSS",
// according to the formula between two points in the plane.

import java.util.Scanner ;
public class Congruent {
    // The Congruent class receiving from the user vertices' rates of two triangles,
    // calculates the lengths of the sides according to the formula of distance between two points,
    // and checks and prints whether congruent triangles through the congruenting sentence "SSS".
    public static void main (String[]args) {
        Scanner scan = new Scanner (System.in) ;

        System.out.println ("This program determines whether two triangles are"
            +" congruent,\nAccording to the formula between two points in the plane.");

        // Receiving from the user the six vertices' rates of triangles respectively.
        System.out.println ("Please enter the vertices' rates "
            + "of the first triangle, respectively.");
        double x11 = scan.nextDouble() ;
        double y11 = scan.nextDouble() ;
        double x12 = scan.nextDouble() ;
        double y12 = scan.nextDouble() ;
        double x13 = scan.nextDouble() ;
        double y13 = scan.nextDouble() ;

        System.out.println ("Now,please enter the vertices' rates "
            + "of the second triangle respectively.");
        double x21 = scan.nextDouble() ;
        double y21 = scan.nextDouble() ;
        double x22 = scan.nextDouble() ;
        double y22 = scan.nextDouble() ;
        double x23 = scan.nextDouble() ;
        double y23 = scan.nextDouble() ;

        // Calculate the lengths of triangles' sides,
        // according to the formula between two points:
        // d = √( (x1-x2)^2 + (y1-y2)^2 )
        double a1= Math.sqrt( Math.pow( (x11-x12) ,2) + Math.pow( (y11-y12) ,2) );
        double b1= Math.sqrt( Math.pow( (x12-x13) ,2) + Math.pow( (y12-y13) ,2) );
        double c1= Math.sqrt( Math.pow( (x13-x11) ,2) + Math.pow( (y13-y11) ,2) );
        double a2= Math.sqrt( Math.pow( (x21-x22) ,2) + Math.pow( (y21-y22) ,2) );
        double b2= Math.sqrt( Math.pow( (x22-x23) ,2) + Math.pow( (y22-y23) ,2) );
        double c2= Math.sqrt( Math.pow( (x23-x21) ,2) + Math.pow( (y23-y21) ,2) );

        // Prints the vertices' rates of the triangles and their lengths respectively.
        System.out.println ("The first traingle is ("+ x11 + "," + y11 + ") "
            + "(" + x12 + "," + y12 + ") " + "(" + x13 + "," + y13 + ")." ) ;
        System.out.println ("The lengths are "+ a1 + ", " + b1 + ", " + c1 + "." );

        System.out.println ("The second traingle is ("+ x21 + "," + y21 +") "
            + "(" + x22 + "," + y22 + ") " + "(" + x23 +"," + y23 + ")." );
        System.out.println ("The lengths are "+ a2 + ", " + b2 + ", " + c2 + "." );

        //Determines whether two triangles are congruent,
        // through the congruenting sentence "SSS".
        boolean congruent = false ;
        if (a1==a2) {
            if (b1==b2 && c1==c2) 
                congruent= true;
            else if (b1==c2 && c1==b2) // && a1==a2
                congruent= true; 
        }
        else if (a1==b2) {
            if (b1==a2 && c1==c2)
                congruent= true;
            else if (b1==c2 && c1==a2) // && (a1==b2)
                congruent= true;
        }
        else if (a1==c2) {
            if (b1==a2 && c1==b2)
                congruent= true;
            else if (b1==b2 && c1==a2) // && a1==c2
                congruent= true;
        }

        //Prints the comparison conclusion.
        System.out.println ( (congruent) ? "The triangles are congruents." : 
            "The triangles are not congruents." ) ;
    } // end of method main
} //end of class Congruent