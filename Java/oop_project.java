/**
 * Test
 */
public class oop_project {
    public static void main(String[] args) {
        BankAccount Jared = new BankAccount(1200, "Jared");
        Jared.getBalance();
        Jared.deposit(1200);
        Jared.withdraw(10000);

        BankAccount Zak = new BankAccount(10, "Zak");
        Jared.transfer(100, Zak);

        InterestRewardsAcct Frank = new InterestRewardsAcct(1000, "Frank");
        Frank.getBalance();
        Frank.deposit(100);

        SavingsAcct Sebastian = new SavingsAcct(1000, "Sebastian");
        Sebastian.withdraw(100);
    }
}