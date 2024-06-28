package itmo.java.basics.lesson11.decorator;

public class MainComponent implements Component {
    @Override
    public void doOperation() {
        System.out.println("World!");
    }
}
