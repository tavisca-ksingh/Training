package banking;

import java.util.Date;
import java.util.Scanner;

public class Account {
   protected String accountNumber;
   protected String name;
   protected double balance;
   protected String accountType;
   protected Date date;

   Scanner sc = new Scanner(System.in);

   public String getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public String getAccountType() {
      return accountType;
   }

   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   public Date getDate() {
      return date = new Date();
   }

   public Account() {

   }

   public void openAccount(){

      System.out.println("Enter Account No: ");
      accountNumber =sc.nextLine();
      System.out.println("Enter Name: ");
      name=sc.nextLine();
      System.out.println("Enter Balance: ");
      balance=sc.nextDouble();
   }

   public void showAccount(){
      System.out.println("{" +
              " accountNumber='" + accountNumber + '\'' +
              ", name='" + name + '\'' +
              ", balance=" + balance +
              ", accountType='" + accountType + '\'' +
              ", date=" + getDate() +
              " } ");
   }


   public void deposit(){
      double amount;
      System.out.println("Enter Amount U Want to Deposit : ");
      amount=sc.nextDouble();
      balance=balance+amount;
   }

   public void withdrawal(double amount)
   {
      if(balance>=amount)
      {
         balance=balance-amount;
      }
      else
      {
         System.out.println("Less Balance..Transaction Failed.." + (balance - amount));
      }
   }

   public boolean search(String acn)
   {
      if(accountNumber.equals(acn))
      {
         showAccount();
         return(true);
      }
      return(false);
   }

}
