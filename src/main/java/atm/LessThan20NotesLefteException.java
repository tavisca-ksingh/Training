package atm;

public class LessThan20NotesLefteException extends Exception {
    LessThan20NotesLefteException(String s){
        super("less the 20 notes are left in " + s);
    }
}
