import java.util.Scanner;
/** Problem Algorithm
 * Get input for miles driven int
 * Get input for gallon Used in int
 *
 * Calculated and display miles per gallon for each trip.
 *
 * Calculate the average mile per gallon for all trips and provide the result in a
 * float format.
 * */

public class GasMilageExercise {
    public static void main(String[] args) {
        int counter = 0;
        double  milePerGallon = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of mile driven or 0 (ZERO) to end the program ");
        int mileDriven = scanner.nextInt();

        System.out.println("Enter number of gallon used");
        int gallonUsed = scanner.nextInt();

        while (mileDriven != 0 && gallonUsed != 0){
            milePerGallon  += mileDriven / gallonUsed;
            System.out.println("Enter number of mile driven or 0 (ZERO) to end the program ");
            mileDriven = scanner.nextInt();

            System.out.println("Enter number of gallon used");
            gallonUsed = scanner.nextInt();
            counter++;
        }
        System.out.println("Mile per gallon is " + milePerGallon);

        double averageOfAllTrips = milePerGallon / counter;
        System.out.println("Average on all trips = " + averageOfAllTrips);
    }
}
