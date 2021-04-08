package ro.fasttrackit.curs9.overloading;

public class Car {
    private int speed;
    private String destination;
    private int gear;

    public Car() {
        this("garaj");
    }

    public Car(String destination) {
        this(destination, 0);
    }

    public Car(String destination, int speed) {
        this.speed = speed;
        this.destination = destination;
    }

    public void drive() {
        drive("Oradea", 100);
    }

    public void drive(String destination, int speed) {
        this.destination = destination;
        this.speed = speed;
    }
}
