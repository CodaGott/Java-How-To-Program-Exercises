import java.util.Scanner;

public class CreditLimitTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CreditLimit test = new CreditLimit(23455, 2500);

        System.out.println("Initial account balance and credit limit is " + test.getCreditLimit() + test.getAccountBalance());

        System.out.println("How much is the item worth? ");
        test.setItemCharges(input.nextInt());


    }
}
