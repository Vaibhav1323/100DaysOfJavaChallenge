public class Dog {
    private String name;
    private int age;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println("Woof!");
    }

    // Method to get the dog's name
    public String getName() {
        return name;
    }

    // Method to get the dog's age
    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Fido", 3);

        // Call methods on the Dog object
        myDog.bark();
        System.out.println("My dog's name is " + myDog.getName() + " and it is " + myDog.getAge() + " years old.");
    }
}
