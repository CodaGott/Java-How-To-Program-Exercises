import java.util.Scanner;

public class SalesCommision {
    public static void main(String[] args) {
        int counter = 1;
        int total = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.printf("%s%20s%n", "Items", "Value");
        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter item sold",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");
        while (userInput.hasNext()){
            int itemBought = userInput.nextInt();
            total += itemBought;
            counter++;
        }
        System.out.println(total);
        double weeklyPercentage = (double) (total * 9) / 100;
        double weeklyTakeHome = weeklyPercentage + 200;
        System.out.println("Weekly percentage is : "+weeklyPercentage);
        System.out.println("Weekly pay with percentage is : " + weeklyTakeHome);
    }
}
