package itmo.java.basics.lesson6;

public class Child extends Parent {
    private Integer age;

    public Child(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void print() {
        String gender = super.gender;
        System.out.println("Child method works");
    }

    public void childMethod() {
        //logic
    }
}
