public class Main {
    public static void main(String[] args) {
        BankAccount lukesAccount = new BankAccount(12323, 1000, "Luke",
                "Luke.heuser@crazyzanny.com", 1020450968);

        BankAccount testAccount = new BankAccount();

        System.out.println(lukesAccount.getAccountBalance());
        System.out.println(lukesAccount.getAccountNumber());

//        bankAccount.setCustomerName("Luke");
//        bankAccount.setCustomerEmail("Luke.heuser@crazyzanny.com");
//        bankAccount.setPhoneNumber(1081291234);
//        bankAccount.setAccountNumber(12323);
//        bankAccount.setAccountBalance(1000);

        lukesAccount.depositFunds(1500);
        lukesAccount.withdrawFunds(2500.01);
        lukesAccount.withdrawFunds(2500);
        lukesAccount.depositFunds(1565.45);
        lukesAccount.depositFunds(434.55);
        lukesAccount.withdrawFunds(2000.01);

        BankAccount hannahsAccount = new BankAccount("Hannah", "hannah@gmail.com", 1405148498);
        System.out.println("Account #: " + hannahsAccount.getAccountNumber() +
                "; name " + hannahsAccount.getCustomerName());
    }
}
