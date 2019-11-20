package abstractFactoryPattern.factory;

import abstractFactoryPattern.bank.Bank;
import abstractFactoryPattern.bank.HDFC;
import abstractFactoryPattern.bank.SBI;
import abstractFactoryPattern.loan.Loan;

public class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        }
         else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}