package training.others;

public class Controller {

    public static void main(String[] args) throws LowBalanceException {
        Account2 acc =new Account2("123",10000.);
        acc.withdraw(30000);
    }
}
