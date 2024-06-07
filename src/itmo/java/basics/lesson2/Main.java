package itmo.java.basics.lesson2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X5");

        car.setPrice(1000000L);
        car.setColor(Color.GREEN);

        System.out.println(car);

        String brand = car.getBrand();
        System.out.println(brand);


        String description = car.getColor().getDescription();

        System.out.println(car.getColor());
        System.out.println(description);


        long totalPrice = CarService.getTotalPrice(car, 5000);

        System.out.println(totalPrice);

    }


    public String overloadedMethod () {
        return null;
    }

    public Long overloadedMethod (Integer integer) {
        return null;
    }

    public String overloadedMethod (Integer integer, String str) {
        return null;
    }

    public void overloadedMethod (Integer integer, String str, Color color) {

    }
}
