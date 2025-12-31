
package AdvanceOOP;

public class Car {
    // Attributes (properties)
    private String color;
    private String brand;
    private int speed;

    // Constructor - creates a new Car object
    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.speed = 0;
    }

    // Methods (actions)
    public void start() {
        System.out.println("The " + brand + " is starting...");
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Speed is now: " + speed + " km/h");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color);
    }
}

// Using the Car class
class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Toyota");
        myCar.start();
        myCar.accelerate(50);
        myCar.displayInfo();
    }
}