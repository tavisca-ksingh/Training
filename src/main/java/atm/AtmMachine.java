package atm;

public class AtmMachine {
    private int note2000 =50;
    private int note500 = 50;
    private  int note100 = 50;

    public void  validateAmount( double amount) throws InvalidAmountException, MoreThan20NotesNeeded, LessThan20NotesLefteException {
        if(amount%100 == 0){
            checkNote(amount);
        }
        else
        {
            throw  new InvalidAmountException();
        }
    }

    public double getNote2000() {
        return note2000;
    }

    public void setNote2000(double amount) throws LessThan20NotesLefteException {

        if((amount/2000)>getNote2000())
        {
            throw new LessThan20NotesLefteException(String.valueOf(getNote100()));
        }
        else {
            this.note2000 -= (amount/2000);
        }

    }

    public double getNote500() {
        return note500;
    }

    public void setNote500(double amount) throws LessThan20NotesLefteException {

        if((amount/500)>getNote500())
        {
            throw new LessThan20NotesLefteException(String.valueOf(getNote100()));
        }
        else {
            this.note500 -= (amount/500);
        }
    }

    public double getNote100() {
        return note100;
    }

    public void setNote100(double amount) throws LessThan20NotesLefteException {
        if((amount/100)>getNote100())
        {
            throw new LessThan20NotesLefteException(String.valueOf(getNote100()));
        }
        else {
            this.note100 -= (amount / 100);
        }
    }

    public void withdraw(double amount)  throws LessThan20NotesLefteException{
        if(amount % 2000 == 0 ){
            setNote2000(amount);
        }
        else if(amount% 500 == 0){
            setNote500(amount);
        }
        else  if(amount% 100 == 0){
            setNote100(amount);
        }

    }

    public void checkNote(double amount) throws MoreThan20NotesNeeded , LessThan20NotesLefteException{
        double numberOfNotes = amount/20;
        if(numberOfNotes == 2000 || numberOfNotes == 500 ||   numberOfNotes == 100){
            System.out.println("amount is available to checkout");
            if(numberOfNotes == 2000 ){
                setNote2000(amount);
            }
            else if(numberOfNotes == 500){
                setNote500(amount);
            }
            else{
                setNote100(amount);
            }
        }
        else{
          throw new MoreThan20NotesNeeded();
        }
    }
}
