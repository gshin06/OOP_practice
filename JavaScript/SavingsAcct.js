import InterestRewardsAcct from "./InterestRewardsAcct.js";

export default class SavingsAcct extends InterestRewardsAcct {
    constructor(initialAmount, acctName) {
        super(initialAmount, acctName);
        this.fee = 5;
    }

    withdraw(amount) {
        try {
            this.viableTransaction(amount + this.fee);
            this.balance = this.balance - (amount + this.fee);
            console.log("\nWithdraw completed.");
            this.getBalance();
        } catch (err) {
            console.log("\nWithdraw interrupted: " + err);
        }
    }
}