package training.others;

public class HelloWorld {
static {
    System.out.println("hello");
}

HelloWorld(){
    System.out.println("contructor");
}

    public static void main(String[] args) {
    HelloWorld h1=new HelloWorld();
//        Account a1 = new SavingAccont();
//        a1.deposit(23);
//        SavingAccont s2 = (SavingAccont)a1;
//        System.out.println(s2.minAcc);
}

    public static void func(double d){
        System.out.println("double : " + d);
    }

    public  void func2(float d){
        System.out.println("float : " + d);
        func(2);
    }

}
