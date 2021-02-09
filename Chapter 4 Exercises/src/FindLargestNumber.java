import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int number;
        int largestNumber = 0;

        while (counter <= 10){
            System.out.println("Enter number");
            number = scanner.nextInt();
            if (number > largestNumber){
                largestNumber = number;
            }
            counter++;
        }
        System.out.println("Largest Number is " + largestNumber);
    }
}
