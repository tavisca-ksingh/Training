package house;

import java.util.ArrayList;
import java.util.List;

public  class Room {
    List<Devices> devicesList= new ArrayList<>();
    private String name;

    public Room() {
    }

    public Room(String name, List<Devices> devicesList) {
        this.name = name;
        this.devicesList = devicesList;

    }

    public String getName() {
        return name;
    }

    public List<Devices> getDevicesList() {
        return devicesList;
    }

    public void setDevicesList(List<Devices> devicesList) {
        this.devicesList = devicesList;
    }

    public boolean search(String rname){

        if(name.equals(rname))
        {
            System.out.println(devicesList);
            return(true);
        }
        return(false);
    }



    @Override
    public String toString() {
        return "[" +
                "Room name='" + name +
                ", \n [ devicesList = " + devicesList + "]" +
               '\'' +
                "]\n\n";
    }
}
