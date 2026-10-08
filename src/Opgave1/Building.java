package Opgave1;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name){
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    void addRoom(Room room){
        rooms.add(room);
    }

    public int getTotalLampCount(){
        int totalLampCount = 0;
        for (Room room : rooms){
            totalLampCount += room.getLampCount();
        }
        return totalLampCount;
    }

    public int getTotalWatt(){
        int totalWatt = 0;
        for (Room room : rooms){
            totalWatt += room.getTotalWatt();
        }
        return totalWatt;
    }

    void printBuilding(){
        System.out.println("====="+this.name.toUpperCase()+"=====");
        System.out.println();
        for (Room room : rooms){
            System.out.println(room);
            System.out.println("Number of lamps: " + room.getLampCount());
            System.out.println("Number of windows: " + room.getWindowCount());
            System.out.println();
        }
    }
}
