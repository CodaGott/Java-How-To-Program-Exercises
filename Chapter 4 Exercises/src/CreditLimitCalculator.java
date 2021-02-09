/**
 * 4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
 * department-store customers has exceeded the credit limit on a charge account. For each customer,
 * the following facts are available:
 * a) account number
 * b) balance at the beginning of the month
 * c) total of all items charged by the customer this month
 * d) total of all credits applied to the customer’s account this month
 * e) allowed credit limit.
 * The program should input all these facts as integers, calculate the new balance (= beginning balance
 * + charges – credits), display the new balance and determine whether the new balance exceeds the
 * customer’s credit limit. For those customers whose credit limit is exceeded, the program should
 * display the message "Credit limit exceeded".
 */


public class CreditLimitCalculator {
    private int customerAccountNumber;
    private int accountBalance;
    private int itemCharges;
    private int creditLimit;
    private int newBalance;

    public static void main(String[] args) {
        CreditLimitCalculator cl = new CreditLimitCalculator(2000,
                1212);
        System.out.println(cl.getItemCharges());
    }
    public CreditLimitCalculator(int creditLimit, int customerAccountNumber){
        this.creditLimit = creditLimit;
        this.customerAccountNumber = customerAccountNumber;
    }

    public int getCustomerAccount() {
        return customerAccountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        accountBalance += creditLimit;

        creditLimit = creditLimit - itemCharges;

        if (itemCharges > creditLimit) {
            System.out.println("Credit Limit exceeded");
        }else if (itemCharges < creditLimit){
            System.out.println("Purchase Successful!");
        }
        this.accountBalance = accountBalance;
    }

    public int getItemCharges() {
        return itemCharges;
    }

    public void setItemCharges(int itemCharges) {
        itemCharges = itemCharges - getCreditLimit();

        if (itemCharges > accountBalance){
            System.out.println("Not enough credit");
        }else if (itemCharges < accountBalance){
            System.out.println("Successful transaction");
        }
        this.itemCharges = itemCharges;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(int newBalance) {
        newBalance = accountBalance + itemCharges - creditLimit;
        this.newBalance = newBalance;
    }
}
