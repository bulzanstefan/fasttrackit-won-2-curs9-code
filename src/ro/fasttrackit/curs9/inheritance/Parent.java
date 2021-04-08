package ro.fasttrackit.curs9.inheritance;

public class Parent {
    //constanta in Java
    public static final String CONST = "test";

    public final String publicString;
    protected int protectedInt;
    int defaultInt;
    private String privateString;

    public Parent(String name) {
        this.publicString = name;
    }

    public void publicMethod() {
        System.out.println("Parent public method " + privateString);
    }

    protected void protectedMethod() {
        System.out.println("Parent protected method");
    }

    void defaultMethod() {
        System.out.println("Parent default method");
    }

    private void privateMethod() {
        System.out.println("Parent private method");
    }

    public final void finalMethod() {
        System.out.println("final method");
    }
}
