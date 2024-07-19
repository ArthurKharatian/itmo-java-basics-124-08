package itmo.java.basics.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Integer calculate = calculate((a, b, c, d) -> a * b * c * d, List.of(1, 2, 3, 4));
//        System.out.println(calculate);

        List<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(3);
        integers.add(3123);
        integers.add(13);
        integers.add(55123);



//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

//        integers.forEach(System.out::println);

//        System.out.println(integers);
        integers.removeIf(integer -> integer > 13);
//        System.out.println(integers);

    }


//    public static Integer calculate(MyFunction<Integer, Integer, Integer, Integer, Integer> function, List<Integer> numbers) {
//        return function.apply(numbers.get(0), numbers.get(1), numbers.get(2), numbers.get(3));
//    }

    public static void getText(Consumer<String> predicate) {
         predicate.accept("Hello world");
    }
}
