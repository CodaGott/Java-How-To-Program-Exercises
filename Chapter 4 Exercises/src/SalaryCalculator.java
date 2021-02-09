import java.util.Scanner;

/**HOW TO SOLVE THIS PROBLEM!!!

 multiply the hourly pay by number of hours worked.
 the overtime pay is gross payment multiplied 1.5*/

public class SalaryCalculator {
    public static void main(String[] args) {
        final int hourlyPay = 20;

        double grossPay1 = 0;
        double grossPay2 = 0;
        double grossPay3 = 0;

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int employee1WorkDuration = 0;
        int employee2WorkDuration = 0;
        int employee3WorkDuration = 0;
        int employee1Earning = 0;
        int employee2Earning = 0;
        int employee3Earning = 0;


        while (counter != 1){
            employee1Earning = hourlyPay * employee1WorkDuration;


            System.out.println("Enter amount of hours employee 1 worked");
            employee1WorkDuration = input.nextInt();

            if (employee1WorkDuration > 40) {
                grossPay1 += employee1Earning * 1.5;
            }else if (employee1WorkDuration <= 40){
                grossPay1 = hourlyPay * employee1WorkDuration;
            }
            employee2Earning = hourlyPay * employee1WorkDuration;
            System.out.println("Enter amount of hours employee 2 worked");
            employee2WorkDuration = input.nextInt();

            if (employee2WorkDuration > 40) {
                grossPay2 += employee2Earning * 1.5;
            }else if (employee2WorkDuration <= 40){
                grossPay2 = hourlyPay * employee2WorkDuration;

            }
            employee3Earning = hourlyPay * employee1WorkDuration;
            System.out.println("Enter amount of hours employee 3 worked");
            employee3WorkDuration = input.nextInt();

            if (employee3WorkDuration > 40) {
                grossPay3 += employee3Earning * 1.5;
            }else if (employee3WorkDuration <= 40){
                grossPay3 = hourlyPay * employee3WorkDuration;
            }
            ++counter;





        }
        System.out.println("Employee 1 gross pay " + grossPay1);
        System.out.println("Employee 2 gross pay "+ grossPay2);
        System.out.println("Employee 3 gross pay " + grossPay3);

//        System.out.println(employee1Earning);
    }
}