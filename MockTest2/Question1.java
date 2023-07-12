package MockTest2;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barking.");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Cow making own sounds.");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();       
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
    }
}
