package itmo.java.basics.lesson6;

public abstract class Transport implements Movable {

    private Integer weight;
    private Integer seatPlace;
    private Boolean isFlying;
//    private int[] arr;

    public Transport(Integer weight, Integer seatPlace, Boolean isFlying) {
        //, int arraySize
        this.weight = weight;
        this.seatPlace = seatPlace;
        this.isFlying = isFlying;
//        this.arr = new int[arraySize];
    }

    protected abstract void abstractMethod();

    public void info() {
        //logic
    }

}
