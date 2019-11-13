package houseAutomation.classes;

import java.util.ArrayList;

public class House {
    public static House instance = new House();

    ArrayList<Room> home = new ArrayList<>();
    private House(){}

    static House getInstance()
    {
        return instance;
    }

    public ArrayList<Room> getRooms(){
        return home;
    }

    public void addRoom(Room room){
        home.add(room);
    }

    public void removeRoom(String roomName)
    {
        home.remove(home.contains(roomName));
    }

}
