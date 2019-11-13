package movieDetails;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class Actor{
    private String  name;
    private String details;

    public Actor(String name, String details) {
        this.name = name;
        this.details = details;

    }

    public Actor() {
    }


    public String getName() {
        return name;
    }


    public String getDetails() {
        return details;
    }


    public void setDetails(String details) {
        this.details = details;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", details='" + details + '\'' +
                "}\n";
    }
}
