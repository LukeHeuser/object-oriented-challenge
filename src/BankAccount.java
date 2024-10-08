public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public void depositFunds(double deposit){ // Method that adds a deposit to the balance.
        accountBalance += deposit;
        System.out.println("Good day, " + customerName + ". Your new account balance after depositing $" + deposit + " is $" +
                accountBalance +".");
    }

    public void withdrawFunds(double withdrawAmount){ // method that only withdraws if there are sufficient funds.
        if(accountBalance - withdrawAmount < 0 ){
            System.out.println("Can not withdraw $" + withdrawAmount + ". There " +
                    "is not enough funds in the account." );
            System.out.println("Your account balance is $" + accountBalance);

        } else {
            accountBalance -= withdrawAmount;
            System.out.println("You have withdrawn $" + withdrawAmount + ". Your new account balance is $" + accountBalance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}