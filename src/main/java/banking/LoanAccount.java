package banking;

public class LoanAccount extends Account {

    @Override
    public void openAccount() {
        System.out.println("Enter Account No: ");
        accountNumber =sc.nextLine();
        System.out.println("Enter Name: ");
        name=sc.nextLine();
        balance = 0;
        accountType="loan";
        System.out.println("Enter the Loan amount you want to take");
        double loan = sc.nextDouble();
        withdrawal(loan);
        showAccount();
    }

    @Override
    public void withdrawal(double loan) {
        balance=balance-loan;
    }
}
