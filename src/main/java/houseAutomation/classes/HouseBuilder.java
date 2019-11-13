package houseAutomation.classes;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;

import javax.naming.Name;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class HouseBuilder {

    public House buildHouse(){
        House home= null;
        try{
            home = House.getInstance();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder data =  factory.newDocumentBuilder();
            Document house = (Document) data.parse("data1.xml");

            NodeList rooms = house.getElementsByTagName("room");
            for(int roomcounter = 0; roomcounter<rooms.getLength(); roomcounter++){
                NodeList devices = rooms.item(roomcounter).getChildNodes();
                NamedNodeMap roomAttrib = rooms.item(roomcounter).getAttributes();
                String roomName = roomAttrib.getNamedItem("name").getNodeValue();

                for(int deviceCount = 0 ; deviceCount < devices.getLength(); deviceCount++){
                    if(!devices.item(deviceCount).getNodeName().equals("#text")){
                        Room room = new Room(1,roomName);
                        NodeList deviceList = devices.item(deviceCount).getChildNodes();

                        for(int devCount = 0; devCount<deviceList.getLength(); devCount++){
                            if(!deviceList.item(devCount).getNodeName().equals("#text")){
                                Node device = deviceList.item(devCount);
                                NamedNodeMap attributes = device.getAttributes();
                                String name = attributes.item(0).getNodeValue();
                                String value = attributes.item(1).getNodeValue();

                              // System.out.println("name : " + name + "  value : " + value);
                                room.setDevice(DeviceBuilder.buildDevice(name,value));

                            }
                        }
                        home.addRoom(room);
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return home;
    }



}
