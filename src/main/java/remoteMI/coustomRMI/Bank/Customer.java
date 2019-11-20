package remoteMI.coustomRMI.Bank;

import java.io.Serializable;

public class Customer implements Serializable {

    private int acc_no;
    private String name;
    private float amount;

    public Customer() {
    }

    public Customer(int acc_no, String name, float amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}
