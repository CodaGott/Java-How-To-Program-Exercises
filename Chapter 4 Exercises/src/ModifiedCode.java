import java.util.Scanner;

public class ModifiedCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.println("Enter result (1 = pass, 2 = failure): ");
            int result = scanner.nextInt();

            if (result != 1 && result != 2){
                continue;
            }else if (result == 1){
                passes += 1;
            }else
                failures += 1;
            ++studentCounter;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if(passes > 8){
            System.out.println("Buy that instructor a beer!");
        }

    }
}
