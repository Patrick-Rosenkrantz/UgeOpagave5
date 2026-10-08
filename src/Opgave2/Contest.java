package Opgave2;

public class Contest {
    private int roundCount = 0;

    public Contest(Animal animal1, Animal animal2){
        while (animal1.isActive() && animal2.isActive()) {
            roundCount++;

            System.out.println("=== ROUND "+roundCount+" ===");

            System.out.println(animal1.getName()+ " attack for "+ animal1.attack());
            animal2.takeDamage(animal1.attack());
            System.out.println();

            System.out.println(animal2.getName()+" has "+ animal2.getEnergy()+ " energy left");
            if (!animal2.isActive()) {
                System.out.println(animal2.getName() +" is dead");
                System.out.println(animal1.getName()+ " is the winner");
                break;
            }

            System.out.println(animal2.getName()+ " attack for "+ animal2.attack());
            animal1.takeDamage(animal2.attack());
            System.out.println();

            System.out.println(animal1.getName()+ " has "+ animal1.getEnergy()+ " energy left");
            if(!animal1.isActive()){
                System.out.println(animal1.getName() + " is dead");
                System.out.println(animal2.getName()+ " is the winner");
                break;
            }
        }
    }
}
