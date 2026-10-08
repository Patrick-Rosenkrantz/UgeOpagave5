package Opgave1;
import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name){
        this.name = name;
        this.lamps = new ArrayList<Lamp>();
        this.windows = new ArrayList<Window>();
    }

    void addLamp(Lamp lamp){
        lamps.add(lamp);
    }

    void addWindow(Window window){
        windows.add(window);
    }

    public int getLampCount(){
        return lamps.size();
    }

    public int getWindowCount(){
        return windows.size();
    }

    public int getTotalWatt(){
        int totalWatt = 0;
        for (Lamp lamp : lamps){
            totalWatt += lamp.getWatt();
        }
        return totalWatt;
    }

    public int getTotalWindowArea(){
        int totalArea = 0;
        for (Window window : windows){
            totalArea += window.getAreaCM2();
        }
        return totalArea;
    }

    void printRoom(){
        System.out.println(Room.class);
    }

    public String toString(){
        return "Room: "+ this.name.toUpperCase();
    }

}
