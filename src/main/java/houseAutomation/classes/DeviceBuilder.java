package houseAutomation.classes;

import houseAutomation.Interface.Operable;

public class DeviceBuilder {

    public static Operable buildDevice(String name,String deviceType){
        Operable device = null;
        try{
            String deviceName = "houseAutomation.classes." + deviceType;
            Class c =  Class.forName(deviceName);
            device = (Operable)c.newInstance();
            device.setName(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return device;
    }
}
