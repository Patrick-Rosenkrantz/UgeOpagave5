package Opgave2;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba", 50));
        animals.add(new Rabbit("Harold",150));
        animals.add(new Wolf("Torben", 100));
        animals.add(new Lion("Lars",75));

        Contest contest = new Contest(animals.get(2), animals.get(1));




    }
}
