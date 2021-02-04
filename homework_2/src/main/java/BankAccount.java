public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credit (double amountAccrual){
        balance = balance+amountAccrual;
        return balance;
    }

    public double debit (double amountWithdrawal) throws AmountExceededException {
        if (amountWithdrawal>balance) {
            throw new AmountExceededException();
        }
        else balance = balance - amountWithdrawal;
        return balance;
    }
}

