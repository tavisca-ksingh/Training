package abstractFactoryPattern.loan;

public class HomeLoan extends Loan {
    @Override
    public void getInterestRate(double rate) {
            this.rate= rate;

    }
}
