package atm;

public class MoreThan20NotesNeeded extends  Exception{
    MoreThan20NotesNeeded(){
        super("More than 20 Notes needed do you want to proceed Y/N");
    }
}
