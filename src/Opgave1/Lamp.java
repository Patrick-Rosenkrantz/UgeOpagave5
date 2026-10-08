package Opgave1;

public class Lamp {
    private boolean isOn;
    private int watt;

    public Lamp(int watt){
        this.watt= watt;
        isOn = false;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public String toString(){
        return "Lamp is on: "+ isOn + "  | watt is: "+watt;
    }

    public int getWatt() {
        return watt;
    }
}
