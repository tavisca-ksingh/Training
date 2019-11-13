package house;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control {
   private static List<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
         System.out.println(rooms);
         System.out.println("1. Add Room \n" +
                 "2. Add Devices \n" +
                 "3. For Change The Status of any device in any rooms \n" +
                 "4. Check device on Time \n"
           );
         n=sc.nextInt();
         switch (n) {
             case 1:
                 createRoom();
                 break;
             case 2:
                 addDevice();
             case 3:
                 changeStatus();
                 break;
             case 4:
                 checkOnTime();
                 break;
             default:
                 break;
         }
     }while (n>=1 && n<=4);
    }

    private static void checkOnTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To see device Status Enter room name");
        String rname =  sc.nextLine();
        boolean found = false;
        for(int i=0;i<rooms.size();i++) {
            found  = rooms.get(i).search(rname);
            if(found){
                    Room foundRoom =rooms.get(i);
                    System.out.println("Enter the Device Name : ");
                    String device = sc.nextLine();
                    foundRoom.devicesList.stream().filter(name -> (name.getGadgets().equals(device))).forEach(Devices::setTotalOnTime);
            }
        }
        if(!found){
            System.out.println("No Rooms found");
        }
    }

    private static void changeStatus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To see device Status Enter room name");
        String rname =  sc.nextLine();
        boolean found = false;
        for(int i=0;i<rooms.size();i++) {
            found  = rooms.get(i).search(rname);
            if(found){
                System.out.println("Do Want to Change Device Status Y/N");
                String status = sc.nextLine();
                if(status.equalsIgnoreCase("y")){
                    Room foundRoom =rooms.get(i);
                    System.out.println("Enter the Device Name : ");
                    String device = sc.nextLine();
                    foundRoom.devicesList.stream().filter(name -> (name.getGadgets().equals(device))).forEach(Devices::changeState);
                    System.out.println(foundRoom);
                }
            }
        }
        if(!found){
            System.out.println("No Rooms found");
        }
    }

    private static void addDevice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To add device enter room name and device names");
        String rname =  sc.nextLine();
        String dname = sc.nextLine();
        boolean found = false;
        for(int i=0;i<rooms.size();i++) {
          found  = rooms.get(i).search(rname);
            if(found){
                    rooms.get(i).devicesList.add(new Devices(dname));
            }
        }
        if(!found){
            System.out.println("No Rooms Finds");
        }
    }


    private static void createRoom()  {
        Scanner sc = new Scanner(System.in);
        String roomName;
            System.out.println("Enter the room Name : ");
            roomName = sc.nextLine();
            rooms.add(new Room(roomName, addGadgets()));
    }

    public static List<Devices> addGadgets()
        {
            Scanner sc = new Scanner(System.in);
            String device;
            List<Devices> devices = new ArrayList<>();
            System.out.println("Press E to exit");
            System.out.println("Enter the gadgets name to add : ");
            do {
                device = sc.nextLine();
                if(device.equalsIgnoreCase("e")){
                    break;
                }
                devices.add(new Devices(device));
            }
            while (!device.equalsIgnoreCase("e"));
            return devices;
        }
}
