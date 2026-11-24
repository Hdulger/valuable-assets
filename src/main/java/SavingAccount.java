public class SavingAccount extends BankAccount {
    private final static double interestRate=0.033;

    public SavingAccount(double balance) {
        super(balance);
    }
    @Override
    public double getValue() {
        return getBalance()*interestRate;
    }



}
