import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        int firstHighest = 0;
        int secondHighest = 0;
        int counter = 1;

        Scanner scanner = new Scanner(System.in);

        while (counter <= 10){

            System.out.println("Enter number");
            int number = scanner.nextInt();

            if (firstHighest < number){
                secondHighest = firstHighest;
                firstHighest = number;
            } else if (secondHighest < number){
                secondHighest = number;
            }
            ++counter;
        }
        System.out.println("First largest is: " + firstHighest);
        System.out.println("Second largest is: " + secondHighest);

    }
}
