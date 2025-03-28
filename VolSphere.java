import java.util.Scanner;

/**
* The VolSphere program asks the user to enter a radius,
* then calculates and displays the sphere's volume with the given radius.
*
* @author Noah Smith
* @version 1.0
* @since 2025-02-10
*/

final class VolSphere {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private VolSphere() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        // Using Scanner for getting input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the radius of a sphere
        System.out.println("Enter the radius of a sphere: ");

        // Get radius from the user as a double
        Double radius = scanner.nextDouble();

        // Check user's radius to make sure it is greater than zero
        if (radius > 0) {
            // Calculate volume
            Double volume = 4d / 3d * Math.PI * Math.pow(radius, 3);

            // Display volume to the user, rounded to 2 decimal places
            System.out.println(
                    "The volume of the sphere with a radius of "
                    + radius + " is " + String.format("%.2f", volume)
                            + "."
                );
        } else {
            // Tell the user to enter a number greater than zero
            System.out.print("Invalid input. Radius must be");
            System.out.println(" greater than zero. Try again.");
        }

        // Closing Scanner
        scanner.close();
    }
}
