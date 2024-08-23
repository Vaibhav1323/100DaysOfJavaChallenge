// Animal.java
public class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to make a sound
    public void sound() {
        System.out.println("The animal makes a sound.");
    }
}

// Dog.java
public class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Override the sound method
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Animal object
        Animal myAnimal = new Animal("Generic
