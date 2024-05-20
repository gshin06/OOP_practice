import BankAccount from './BankAccount.js'
import InterestRewardsAcct from './InterestRewardsAcct.js';
import SavingsAcct from './SavingsAcct.js';

const Jared = new BankAccount(1000, "Jared");
Jared.getBalance();
Jared.deposit(100);
Jared.withdraw(10000);
const Nick = new BankAccount(1000, "Nick");
Jared.transfer(100, Nick);

const Zak = new InterestRewardsAcct(1000, "Zak");
Zak.getBalance();
Zak.deposit(100);

const Sara = new SavingsAcct(1000, "Sara");
Sara.withdraw(100);