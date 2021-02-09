import java.util.Scanner;

public class SalaryCalcTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SalaryCalc calculateGrossPay = new SalaryCalc(20);
        System.out.println("Enter Work Duration");
        calculateGrossPay.setWorkDuration( scanner.nextInt());
        System.out.println(calculateGrossPay.getSalaryCalculator());
    }
}
