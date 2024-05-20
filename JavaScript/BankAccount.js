import BalanceException from './BalanceException.js'

export default class BankAccount {
    constructor(amount, name) {
        this.balance = amount;
        this.name = name;
    }

    getBalance() {
        console.log("\nAccount '" + this.name + "' Balance = $" + this.balance);
    }

    deposit(amount) {
        this.balance = this.balance + amount;
        console.log("\nDeposit Successful");
        this.getBalance();
    }

    viableTransaction(amount) {
        if (this.balance >= amount) {
            return;
        }
        throw new BalanceException("\nSorry, account '" + this.name + "' only has a balance of $" + this.balance);
    }

    withdraw(amount) {
        try {
            this.viableTransaction(amount);
            this.balance = this.balance - amount;
            console.log("\nWithdraw Complete");
            this.getBalance();
        } catch (err) {
            console.log("\nWithdraw interrupted: " + err);
        }
    }

    transfer(amount, account) {
        try {
            console.log("\n**********\n\nBeginning Transfer..");
            this.viableTransaction(amount);
            this.withdraw(amount); 
            account.deposit(amount);
            console.log("\nTransfer complete!\n\n**********");
        } catch (err) {
            console.log("\nTransfer interrupted: " + err);
        }
    }
}