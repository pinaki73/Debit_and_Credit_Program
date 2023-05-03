public class Account {
    double accountBalance;
    public Account(double startingAmount){
            accountBalance = startingAmount;
        }


    public void debit(double debitAmount){
        if (debitAmount > accountBalance){
            debitAmount = 0;
            System.out.println("Debit amount exceeded account balance");
        }else {
            accountBalance = accountBalance-debitAmount;
        }
    }
    public double getAccountBalance() {
        return accountBalance;
    }


}
