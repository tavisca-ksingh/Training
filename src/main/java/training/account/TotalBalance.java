package training.account;


import java.util.Scanner;

public class TotalBalance {


    public static void main(String[] args) {
        Account [] accounts = new Account[6];



        Scanner sc = new Scanner(System.in);

        for (int i=0; i<6; i++){
            System.out.println("type");
            String t= sc.nextLine();
            System.out.println("balance ");
            double b = sc.nextDouble();
            sc.nextLine();
          accounts[i]=new Account();
          accounts[i].setAccountType(t);
          accounts[i].setBalance(b);
        }

        double currentBalance=0;
        double savingBalance = 0;

        for (int i=0; i<6; i++){

            if(accounts[i].getAccountType().equalsIgnoreCase("c") || accounts[i].getAccountType().equalsIgnoreCase("current")){
                currentBalance+= accounts[i].getBalance();
            }

            else{
                savingBalance+= accounts[i].getBalance();
            }
        }


        System.out.println("Total Current Balance : " + currentBalance);
        System.out.println("Total Saving Balance : " + savingBalance);


    }

}
