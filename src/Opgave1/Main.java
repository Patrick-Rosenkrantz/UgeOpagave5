package Opgave1;

public class Main {
    static void main(String[] args) {
        Building office  = new Building("Office");

        Room cafeteria = new Room("Cafeteria");
        Room toilet = new Room("Toilet");
        Room workSpace = new Room("WorkSpace");

        Lamp lamp1 = new Lamp(50);
        Lamp lamp2 = new Lamp(40);

        Window window1 = new Window(50,10);
        Window window2 = new Window(40,30);

        cafeteria.addLamp(lamp1);
        cafeteria.addLamp(lamp2);
        cafeteria.addWindow(window1);

        toilet.addWindow(window2);
        toilet.addLamp(lamp1);
        toilet.addLamp(lamp1);

        workSpace.addLamp(lamp2);
        workSpace.addLamp(lamp2);
        workSpace.addWindow(window2);

        office.addRoom(cafeteria);
        office.addRoom(toilet);
        office.addRoom(workSpace);

        System.out.println("Total lapms in buidling: " + office.getTotalLampCount());
        System.out.println("Total watt in building: " + office.getTotalWatt());

        office.printBuilding();









    }
}
