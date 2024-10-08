public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("Luke");
        bankAccount.setCustomerEmail("Luke.heuser@crazyzanny.com");
        bankAccount.setPhoneNumber(1081291234);
        bankAccount.setAccountNumber(12323);
        bankAccount.setAccountBalance(1000);

        bankAccount.depositFunds(1500);
        bankAccount.withdrawFunds(2500.01);
        bankAccount.withdrawFunds(2500);
        bankAccount.depositFunds(1565.45);
        bankAccount.depositFunds(434.55);
        bankAccount.withdrawFunds(2000.01);

    }
}
