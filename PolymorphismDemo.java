// Parent class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    // Overriding the parent's method
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof woof!");
    }
}

// Child class 2
class Cat extends Animal {
    // Overriding the parent's method
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and Animal object
        Animal myDog = new Dog();       // Animal reference but Dog object
        Animal myCat = new Cat();       // Animal reference but Cat object

        myAnimal.makeSound();
        myDog.makeSound(); // Calls the Dog's method
        myCat.makeSound(); // Calls the Cat's method
    }
}