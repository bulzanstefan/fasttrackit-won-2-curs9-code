package ro.fasttrackit.curs9.polymorphism;

public class Dacia extends Car {

    @Override
    public void drive(int speed, int gear) {
        System.out.println("Driving in Dacia... ce sa faci?");
    }
}
