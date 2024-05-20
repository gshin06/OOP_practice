public class SavingsAcct extends InterestRewardsAcct {
    double fee;

    SavingsAcct(double initialAmount, String acctName) {
        super(initialAmount, acctName);
        fee = 5;
    }

    @Override
    public void withdraw(double amount) {
        try {
            this.viableTransaction(amount + fee);
            balance = balance - (amount + fee);
            System.out.println("\nWithdraw completed.");
            this.getBalance();
        } catch (BalanceException e) {
            System.out.println("\nWithdraw interrupted: " + e);
        }
    }
}
