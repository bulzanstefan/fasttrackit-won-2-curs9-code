package ro.fasttrackit.curs9.inheritance;

public class OverridingMain {
    public static void main(String[] args) {
        Parent parentChild = new OverridingChild();
        OverridingChild overridingChild = new OverridingChild();

        System.out.println("--- Parent parentChild");
        parentChild.publicMethod();
        parentChild.protectedMethod();
        parentChild.defaultMethod();

        System.out.println();

        System.out.println("--- OverridingChild overridingChild");
        overridingChild.publicMethod();
        overridingChild.protectedMethod();
        overridingChild.defaultMethod();
    }
}
