import BankAccount from "./BankAccount.js";
export default class InterestRewardsAcct extends BankAccount {
    deposit(amount) {
        this.balance = this.balance + (amount * 1.05);
        console.log("\nDeposit complete.");
        this.getBalance();
    }
}