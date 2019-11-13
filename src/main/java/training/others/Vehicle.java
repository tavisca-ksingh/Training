package training.others;

public class Vehicle {
    void print(){
        System.out.println("print");
    }
}

class Check{
    public static void main(String[] args) throws ClassNotFoundException {
        Vehicle v = new Vehicle(){
            @Override
            void print() {
                System.out.println("new");
            }
        };

        Class metadata = Class.forName("training.others.Account2");

        Vehicle v1=  new Vehicle(){
            @Override
            void print() {
                System.out.println("new print");
            }
        };
        v.print();
        v1.print();
    }

}