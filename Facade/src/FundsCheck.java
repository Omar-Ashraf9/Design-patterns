public class FundsCheck {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {
        return cashToWithdrawal <= getCashInAccount();
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
    }

    public void makeWithdrawal(double cashToWithdrawal) {
        if (haveEnoughMoney(cashToWithdrawal)) {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());
        } else {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance is " + getCashInAccount());
        }
    }
}
