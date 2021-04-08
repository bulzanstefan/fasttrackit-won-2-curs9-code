package ro.fasttrackit.curs9.inheritance;

public class SamePackageChild extends Parent {

    public SamePackageChild() {
        super("parent");
    }

    public void childMethod() {
        System.out.println("Ce am mostenit");

        System.out.println(publicString);
        System.out.println(protectedInt);
        System.out.println(defaultInt);
//        System.out.println(privateString);

        publicMethod();
        protectedMethod();
        defaultMethod();
//        privateMethod();
    }
}
