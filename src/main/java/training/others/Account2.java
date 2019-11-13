package training.others;

public class Account2 {
    private String accountNumber;
    private  Double balance;
    private String accountType;

    public Account2(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount){
        System.out.println("Account");
        this.balance += amount;
        return balance;
    }

    public  void withdraw(double amount) throws LowBalanceException {

        if(this.balance<amount){
            Double  l =Math.abs (this.balance - amount);
            throw new LowBalanceException(String.valueOf(l));
        }
        else {
            this.balance -= amount;
        }
    }

}
