package ro.fasttrackit.curs9.polymorphism;

public abstract class Car {
    protected int speed;
    protected int gear;

    public Car() {
        this.gear = 0;
        this.speed = 0;
    }

    public abstract void drive(int speed, int gear);

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    protected void setGear(int gear) {
        this.gear = gear;
    }
}
