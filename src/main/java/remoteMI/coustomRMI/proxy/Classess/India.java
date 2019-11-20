package remoteMI.coustomRMI.proxy.Classess;

import remoteMI.coustomRMI.proxy.Interface.Greetings;

public class India implements Greetings {

    @Override
    public String countries(String country) {
        return "Namaste";
    }
}
