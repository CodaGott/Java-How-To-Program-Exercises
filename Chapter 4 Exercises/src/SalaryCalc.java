import java.util.Scanner;

public class SalaryCalc {
    private double salaryCalculator;
    private int hourlyPay;
    private int workDuration;
    private double grossPay;
    private int employeeEarning;

    Scanner scanner = new Scanner(System.in);

    public SalaryCalc(int hourlyPay) {

        this.hourlyPay = hourlyPay;

    }
//        System.out.println("Enter Work Duration");
//        workDuration = scanner.nextInt();
//        this.workDuration = workDuration;


    public double getSalaryCalculator() {
        if (workDuration > 40) {
            int extraTime = (workDuration-40);
            double extraPay = extraTime * hourlyPay * 1.5;
            grossPay = extraPay + ((workDuration - extraTime) * hourlyPay);
        }else if (workDuration <= 40){
            grossPay = hourlyPay * workDuration;
        }
        return grossPay;
    }

    public void setSalaryCalculator(int salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        hourlyPay = 20;
        this.hourlyPay = hourlyPay;
    }

    public int getWorkDuration() {
        return workDuration;
    }

    public void setWorkDuration(int workDuration) {
        this.workDuration = workDuration;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(int grossPay) {

        this.grossPay = grossPay;
    }

    public int getEmployeeEarning() {

        return employeeEarning;
    }

    public void setEmployeeEarning(int employeeEarning) {
        employeeEarning = hourlyPay * workDuration;
        this.employeeEarning = employeeEarning;
    }
}