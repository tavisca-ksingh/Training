package abstractFactoryPattern.factory;

import abstractFactoryPattern.bank.Bank;
import abstractFactoryPattern.loan.EducationLoan;
import abstractFactoryPattern.loan.HomeLoan;
import abstractFactoryPattern.loan.Loan;

public class LoanFactory extends AbstractFactory{
    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }

}