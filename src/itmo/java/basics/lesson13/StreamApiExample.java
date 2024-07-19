package itmo.java.basics.lesson13;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamApiExample {
    public static void main(String[] args) {

        List<PromoCode> promos = new ArrayList<>();

        promos.add(new PromoCode("SKIDKA200", true));
        promos.add(new PromoCode("SKIDKA200", true));
        promos.add(new PromoCode("SKIDKA200", false));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA100", false));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA400", false));
        promos.add(new PromoCode("SKIDKA400", true));
        promos.add(new PromoCode("SKIDKA500", false));
        promos.add(new PromoCode("SKIDKA600", true));
        promos.add(new PromoCode("SKIDKA100", false));
        promos.add(new PromoCode("SKIDKA300", false));
        promos.add(new PromoCode("SKIDKA300", false));
        promos.add(new PromoCode("SKIDKA300", false));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA200", true));
        promos.add(new PromoCode("SKIDKA200", false));
        promos.add(new PromoCode("SKIDKA100", true));


//        List<PromoCode> collect = promos.stream()
//                .filter(PromoCode::getExpired)
//                .collect(Collectors.toList());
//
//        collect.forEach(System.out::println);
//
//        System.out.println("--------------------------------------");
//
//
//        List<PromoCode> collect2 = promos.stream()
//                .filter(promoCode -> !promoCode.getExpired())
//                .collect(Collectors.toList());
//
//        collect2.forEach(System.out::println);

//        List<PromoCode> collect = promos.stream()
//                .filter(promoCode -> promoCode.getCode().equals("SKIDKA100"))
//                .collect(Collectors.toList());
//
//        collect.forEach(System.out::println);


//        Map<String, List<PromoCode>> collect = promos.stream().collect(Collectors.groupingBy(PromoCode::getCode));
//
//        collect.forEach((k, v) -> {
//            System.out.println("=========================");
//            System.out.println("Номинал: " + k);
//            System.out.println("промо-коды: " + v);
//        });

//        promos.sort(Comparator.comparing(PromoCode::getCode, Comparator.reverseOrder()));
//        promos.forEach(System.out::println);

//        List<String> codes = promos.stream()
//                .map(PromoCode::getCode)
//                .collect(Collectors.toList());

//        System.out.println(codes);


//        Set<Car> cars = promos.stream()
//                .map(promoCode -> new Car(promoCode.getCode(), promoCode.getExpired()))
//                .collect(Collectors.toSet());
//
//        cars.forEach(System.out::println);


        AtomicInteger counter = new AtomicInteger();

        promos.forEach(promoCode -> {
            if (promoCode.getCode().equals("SKIDKA100")) {
                counter.getAndIncrement();
            }
        });

        System.out.println(counter.get());

    }
}
