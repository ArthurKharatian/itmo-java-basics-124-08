package itmo.java.basics.lesson2;

public class CarService {
    public static long getTotalPrice(Car car, Integer servicePrice) {
        if (servicePrice == null) {
            return car.getPrice();
        }

        return car.getPrice() + servicePrice;
    }
}
