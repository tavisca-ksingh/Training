package training.others;

public class LowBalanceException extends Exception {
    public  LowBalanceException(String s){
        super(" \n insufficient Amount : " + s);
    }
}
