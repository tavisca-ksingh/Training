package remoteMI.coustomRMI.proxy.Classess;

import remoteMI.coustomRMI.proxy.Interface.Greetings;

public class France implements Greetings {
    @Override
    public String countries(String country) {
        return "bonjure";
    }
}
