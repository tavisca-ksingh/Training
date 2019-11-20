package CentralExceptionHandling;

import java.util.List;

public class ErrorResponse {
        private  int id;
        private String message;
        private String details;

    public ErrorResponse(int id, String message, String details) {
        this.id = id;
        this.message = message;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return  String.format("\n{ID: %-5d Message: %-10s Details: %-5d}",
                id, message, details);
    }
}
