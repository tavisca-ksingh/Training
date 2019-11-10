package banking;

import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Customer U Want to Input : ");
        int n=sc.nextInt();
        Account  accounts[]=new Account[n];
        sc.nextLine();;
        for(int i=0;i<accounts.length;i++)
        {
            System.out.println("Enter Account Type: ");
            String accountType =sc.nextLine();

            if(accountType.equalsIgnoreCase("salary")) {
                accounts[i] = new SalaryAccount();
            }
            else if(accountType.equalsIgnoreCase("current")) {
            accounts[i] = new CurrentAccount();
            }
            else if(accountType.equalsIgnoreCase("Saving")){
                accounts[i] = new SavingAccount();

            }
            else{
                accounts[i] = new LoanAccount();
            }
                accounts[i].openAccount();
      }
    }

    public void showMenu(Account [] accounts){
        Scanner sc = new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("Main Menu\n" +
                    "1.Deposit\n"+
                    " 2.Withdrawal\n"+
                    " 3.Exit");
            System.out.println("Ur Choice :");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Account No : ");
                    String acn=sc.next();
                    boolean found=false;
                    for(int i=0;i<accounts.length;i++)
                    {
                        found=accounts[i].search(acn);
                        if(found)
                        {
                            accounts[i].deposit();
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("No Accont Found..");
                    }
                    break;


                case 2:
                    System.out.print("Enter Account No : ");
                     acn=sc.next();
                     found=false;
                    for(int i=0;i<accounts.length;i++)
                    {
                        found=accounts[i].search(acn);
                        if(found)
                        {
                            System.out.println("Enter A amount to withdraw");
                            Double amount = sc.nextDouble();
                            accounts[i].withdrawal(amount);
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("No Accont Found..");
                    }
                    break;

                case 3:
                    System.out.println("Good Bye..");
                    break;
            }
        }
        while(ch!=3);
    }
}


