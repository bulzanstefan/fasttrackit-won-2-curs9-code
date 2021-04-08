package ro.fasttrackit.curs9.inheritance;

public class OverridingChild extends Parent {
    public OverridingChild() {
        super("overriding");
    }

    @Override
    public void publicMethod() {
        System.out.println("My new implementation from child");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Child implementation");
        super.protectedMethod();
    }

//    public void finalMethod() {
//
//    }
}
