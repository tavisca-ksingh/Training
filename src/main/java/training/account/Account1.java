package training.account;

import java.io.*;

public class Account1 implements Serializable {

    private  String accountType;
    private double balance;

    public Account1() {
    }

    public Account1(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "accountType='" + accountType + '\'' +
                ", balance=" + balance +
                '}';
    }

}
