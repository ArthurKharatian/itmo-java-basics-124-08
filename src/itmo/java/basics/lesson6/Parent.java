package itmo.java.basics.lesson6;

public class Parent {

    private String name;

    protected String gender;

    public Parent(String name) {
        this.name = name;
    }

    public Parent(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void print() {
        System.out.println("Method from " + this.getClass().getSimpleName() + " class");
    }

    public final void someMethod() {
        //logic
    }

}
