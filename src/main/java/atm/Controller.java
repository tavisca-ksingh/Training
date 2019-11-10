package atm;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) throws LessThan20NotesLefteException {
        AtmMachine atmMachine = new AtmMachine();
        Scanner sc = new Scanner(System.in);
      //  System.out.println(atmMachine.getNote2000()+ " " + atmMachine.getNote500()+ " " + atmMachine.getNote100());
         do {
             System.out.println(atmMachine.getNote2000() * 2000+ " " + atmMachine.getNote500() * 500 + " " + atmMachine.getNote100() * 100);
             withdrawMoney(atmMachine, sc);
         }while (true);
    }

    private static void withdrawMoney(AtmMachine atmMachine, Scanner sc) throws LessThan20NotesLefteException {
        System.out.println("Enter the amount the withdraw");
        double  amount = sc.nextDouble();
        try {
            atmMachine.validateAmount(amount);
        }catch (InvalidAmountException | MoreThan20NotesNeeded | LessThan20NotesLefteException iEx){
            System.out.println(iEx);
            sc.nextLine();
            String status = sc.nextLine();
            if(status.equalsIgnoreCase("y")){
               atmMachine.withdraw(amount);
            }
            else{
                System.out.println("Sorry for the inconvenience");
            }
        }
    }

}
