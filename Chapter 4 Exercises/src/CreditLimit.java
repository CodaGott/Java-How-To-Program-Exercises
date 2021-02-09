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


public class CreditLimit {
    private int accountNumber;
    private int accountBalance; // credit limit
    private int creditLimit; // allow spending
    private int itemCharges; // withdrawal


    public CreditLimit(int accountNumber,  int creditLimit){
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        accountBalance = creditLimit;
        this.accountBalance = accountBalance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        creditLimit = creditLimit - accountBalance;
        this.creditLimit = creditLimit;
    }

    public int getItemCharges() {
        return itemCharges;
    }

    public void setItemCharges(int itemCharges) {

        if (itemCharges > creditLimit) {
            System.out.println("Credit Limit exceeded");
        }else if (itemCharges < creditLimit){
            System.out.println("Purchase Successful!");
        }
        itemCharges = itemCharges - creditLimit;

        this.itemCharges = itemCharges;
    }
}
