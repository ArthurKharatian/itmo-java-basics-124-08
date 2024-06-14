package itmo.java.basics.lesson6;

public class Plane extends Transport {

    public Plane(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    protected void abstractMethod() {

    }

    @Override
    public void printTransportInfo() {
        System.out.println(transportName());
    }

    @Override
    public String transportName() {
        return "SuperJet";
    }
}
