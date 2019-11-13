package houseAutomation;

import houseAutomation.Interface.Operable;
import houseAutomation.classes.House;
import houseAutomation.classes.HouseBuilder;
import houseAutomation.classes.Room;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {
        HouseBuilder b=new HouseBuilder();
        House home=b.buildHouse();
        int noOfRooms = home.getRooms().size();
        System.out.println("The house has "+noOfRooms+" rooms..");

        for(int roomCount=0;roomCount<noOfRooms;roomCount++)
        {
            Room room=home.getRooms().get(roomCount);
            System.out.println("Room: "+room.getRoomName());
            System.out.println("\n *************************************");
            room.allVolume(43);
            System.out.println("\n *************************************");

            ArrayList<Operable> devices=room.getDevices();


            for(Operable device:devices)
            {
                System.out.println("The device: " + device.getName());
            }
        }


    }
}
