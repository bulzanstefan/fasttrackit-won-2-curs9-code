package ro.fasttrackit.curs9.polymorphism;

public class CompanyTransport {
    private int clientsCount = 0;

    public void goToClient(Car companyCar) {
        System.out.println("Starting my client meeting");

        companyCar.drive(50, 3);

        System.out.println("Arrived at my client meeting");
        clientsCount++;
        System.out.println("Client done " + clientsCount);
    }
}
