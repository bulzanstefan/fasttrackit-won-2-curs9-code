package ro.fasttrackit.curs9.polymorphism;

public class Main {
    public static void main(String[] args) {
        CompanyTransport transport = new CompanyTransport();
        transport.goToClient(new BMW());

        System.out.println("ORRR");
        transport.goToClient(new Dacia());

        System.out.println("------");
        transport.goToClient(new Oltcit());
    }
}
