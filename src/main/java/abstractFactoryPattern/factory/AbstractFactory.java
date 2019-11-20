package abstractFactoryPattern.factory;

import abstractFactoryPattern.bank.Bank;
import abstractFactoryPattern.loan.Loan;

public abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}