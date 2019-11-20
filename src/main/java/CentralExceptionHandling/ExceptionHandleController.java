package CentralExceptionHandling;

public class ExceptionHandleController  extends Exception{

    public final void handleAllExceptions(Exception ex) {
       String details = "";
        ErrorResponse error = new ErrorResponse(1,"Server Error", details);
    }


}
