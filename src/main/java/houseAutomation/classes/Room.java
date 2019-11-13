package houseAutomation.classes;

import houseAutomation.Interface.ElectronicDevices;
import houseAutomation.Interface.Operable;
import houseAutomation.Interface.PlumbingDevices;

import java.util.ArrayList;

public class Room {

    int roomId;
    String roomName;

    ArrayList<Operable> devices = new ArrayList<>();

    public Room() {
        roomId = 0;
        roomName = "default";
    }

    public Room(int roomId, String roomName) {
        this.roomId = roomId;
        this.roomName = roomName;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public ArrayList<Operable> getDevices() {
        return devices;
    }

    public void setDevice(Operable device)
    {
        devices.add(device);
    }

    public void shutdown(){
        for(Operable op : devices){
            op.turnOff();
        }
    }

    public void allVolume(int value){
        for(Operable op : devices){
            if(op instanceof PlumbingDevices){
                System.out.println("operable Plumbing device");

            }
        }
    }

    public void startAllDevices(){
        for (Operable op : devices){
            op.turnOn();
        }
    }

}
