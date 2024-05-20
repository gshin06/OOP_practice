public class InterestRewardsAcct extends BankAccount{
    InterestRewardsAcct(double amount, String name) {
        super(amount, name);
    }
    
    @Override
    public void deposit(double amount) {
        balance = balance + (amount * 1.05);
        System.out.println("\nDeposit complete.");
        this.getBalance();
    }
}
