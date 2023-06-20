package ClassRoomTasks;

//Certainly! Here's an example program in Java that demonstrates various object-oriented programming (OOP) concepts:
//
//java
// Parent class
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Inheritance: Dog is a subclass of Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Polymorphism: Cat implements the Animal interface
class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Encapsulation: Car class with private variables and public methods
class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        System.out.println(make + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println(make + " " + model + " is stopping.");
    }
}

// Abstraction: Shape is an abstract class with abstract method
abstract class Shape {
    public abstract double calculateArea();
}

// Polymorphism: Circle extends Shape and overrides calculateArea()
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Composition: Room has a Desk
class Desk {
    private int number;

    public Desk(int number) {
        this.number = number;
    }

    public void use() {
        System.out.println("Using desk number " + number);
    }
}

class Room {
    private Desk desk;

    public Room(int deskNumber) {
        this.desk = new Desk(deskNumber);
    }

    public void useDesk() {
        desk.use();
    }
}

// Main class to demonstrate the OOP concepts
public class OOPConcepts {
    public static void main(String[] args) {
        // Inheritance
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.sleep();
        dog.bark();

        // Polymorphism
        Cat cat = new Cat("Whiskers");
        cat.eat();
        cat.sleep();

        // Encapsulation
        Car car = new Car("Toyota", "Camry");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        car.start();
        car.stop();

        // Abstraction
        Circle circle = new Circle(5.0);
        System.out.println("Area of circle: " + circle.calculateArea());

        // Composition
        Room room = new Room(1);
        room.useDesk();
    }
}

//
//In this program, we have examples of the following OOP concepts:
//
//1. Inheritance: The Dog class extends the Animal class, inheriting its properties and methods.
//2. Polymorphism: The Cat class implements the Animal interface, allowing it to
