public class Main {
    public static void main(String[] args) {
        Portfolio portfolio=new Portfolio();

        BankAccount b1=new CheckingAccount(2000);
        b1.deposit(1000);
        b1.withdraw(500);
        System.out.println(b1.getBalance());
        System.out.println(b1.getBalance());

        portfolio.addValuable(new CheckingAccount(2000));
        portfolio.addValuable(new SavingAccount(1500));
        portfolio.addValuable(new Car("Mercedes", 150000, 4000));
        portfolio.addValuable(new Truck("Chevrolet", 5000, 4000, 10));

        System.out.println("I`m worth: "+portfolio.getValue());

        }


    }

