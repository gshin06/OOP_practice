from bank_accounts import *

Jared = BankAccount(1200, "Jared")
Jeff = BankAccount(1000, "Jeff")

Jared.getBalance()
Jared.deposit(1000)
Jared.withdraw(40000)
# Jared.transfer(40000, Jeff)
Jared.transfer(10000, Jeff)

Xavier = InterestRewardsAcct(1000, "Xavier")
Xavier.getBalance()
Xavier.deposit(100)

Xavier.transfer(100, Jared)
