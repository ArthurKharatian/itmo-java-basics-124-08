package itmo.java.basics.lesson6;

public class Bus extends Transport {
    public Bus(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    public void printTransportInfo() {
        System.out.println(transportName());
    }

    @Override
    public String transportName() {
        return "Scania";
    }

    @Override
    protected void abstractMethod() {

    }
}
