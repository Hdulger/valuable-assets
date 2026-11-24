public abstract class BankAccount implements Valuable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance+=amount;

    }


    public double withdraw(double amount) {
        if(this.balance>amount){
            this.balance-=amount;
            return amount;
        }
        else{
            double withdrawAm=this.balance;
            this.balance=0;
            return withdrawAm;
        }
    }


    public double getBalance() {
        return balance;
    }


    public double getValue() {
        return this.balance;
    }
}
