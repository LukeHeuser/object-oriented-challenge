public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public BankAccount () {
        this(12345, 500.50, "Luke", // This is calling a constructor
                "Crazy.fun@gmail.com", 1016578945);               // within a constructor.
                                                                                // constructor chaining!
        System.out.println("Empty constructor called!");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String customerEmail,
                       int phoneNumber) {
        System.out.println("BankAccount constructor with parameters called!");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, int phoneNumber) {
        this(99999,105, customerName, customerEmail, phoneNumber);

//        this.customerName = customerName; // There is no need to assign fields here, this is done in the constructor.
//        this.customerEmail = customerEmail;
//        this.phoneNumber = phoneNumber;
    }

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
