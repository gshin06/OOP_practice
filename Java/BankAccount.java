public class BankAccount {
    double balance;
    String name;

    BankAccount(double initialAmount, String acctName) {
        balance = initialAmount;
        name = acctName;
        System.out.println("\nAccount '" + name + "' created. \nBalance = $" + balance);
    }

    public void getBalance() {
        System.out.println("\nAccount '" + name + "' Balance = $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDeposit Successful");
        this.getBalance();
    }

    public void viableTransaction(double amount) throws BalanceException {
        if (balance >= amount) {
            return;
        }
        String message = "\nSorry, account '" + name + "' only has a balance of $" + balance;
        throw new BalanceException(message);
    }

    public void withdraw(double amount) {
        try {
            this.viableTransaction(amount);
            balance = balance - amount;
            System.out.println("\nWithdraw Compelte");
            this.getBalance();
        } catch (BalanceException e) {
            System.out.println("\nWithdraw interrupted: " + e);
        }
    }

    public void transfer(double amount, BankAccount account) {
        try {
            System.out.println("\n**********\n\nBeginning Transfer..");
            this.viableTransaction(amount);
            this.withdraw(amount);
            account.deposit(amount);
            System.out.println("\nTransfer complete!\n\n**********");
        } catch (BalanceException e) {
            System.out.println("\nTransfer Interrupted. " + e);
        }
    }
}