package Opgave2;

public abstract class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    String getName(){
        return this.name;
    }

    int getEnergy(){
        return this.energy;
    }

    public void setEnergy(int amount){
        this.energy = amount;
    }

    boolean isActive(){
        if (energy<=0){
            return false;
        }
        return true;
    }

    abstract int attack();

    public void takeDamage(int amount){
        this.energy -= amount;
    }

}
