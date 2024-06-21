package itmo.java.basics.lesson9;

import itmo.java.basics.lesson2.Car;
import itmo.java.basics.lesson6.AnotherChild;
import itmo.java.basics.lesson6.Child;
import itmo.java.basics.lesson6.Parent;

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
//        List list = new ArrayList();
//
//        list.add(123);
//        list.add("String");
//        list.add(true);
//        list.add(new Car());

//        System.out.println(list);

        List<String> strings = new ArrayList<>();
//        var strings2 = new ArrayList<String>();

        strings.add("123");
        strings.add("String");
        strings.add("true");
        strings.add(new Car().toString());

//        System.out.println(strings.get(2));

//        List<int[]> ints = new ArrayList<>();

//        Parent parent = new Parent("Jack");
//        Parent child = new Child("Tom", 35);
//        Parent anotherChild = new AnotherChild("Alice");
//
//        print(parent);
//        print(child);
//        print(anotherChild);
//
//        List<Parent> parents = new ArrayList<>();
//        List<Child> children = new ArrayList<>();
//        List<AnotherChild> anotherChildren = new ArrayList<>();
//
//        print(parents);
//        print(children);
//        print(anotherChildren);
//
//        printSome(parents);
//        printSome(children);
////        printSome(anotherChildren);  // <- тип не подходит

//        System.out.println(strings);
//        Collections.sort(strings);
//        System.out.println(strings);


        List<Integer> integers = new ArrayList<>();

        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(555);
        integers.add(1231);
        integers.add(1231);
        integers.add(1231);
        integers.add(1231);
        integers.add(1231);
        integers.add(1231);
        integers.add(1231);
        integers.add(33);
        integers.add(3331);
        integers.add(676);    // remove удаляет первый элемент с таким значением
        integers.add(676);
        integers.add(676);
        integers.add(8);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);

//
//        System.out.println(integers);
//        integers.remove(Integer.valueOf(676));
//        System.out.println(integers);

//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println(integers.get(i));
//        }

//        for (Integer integer : integers) {
//            if (integer > 676) {
//                integers.remove(integer);   // <- ConcurrentModificationException
//            }
//        }

//        System.out.println(integers);


//        Iterator<Integer> iterator = integers.iterator();
//
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next > 676) {
//               iterator.remove();
//            }
//        }
//
//        System.out.println(integers);

        List<Integer> ints = Arrays.asList(123, 45, 453, 22); // Java 8


//        ints.add(123); // UnsupportedOperationException

        List<Integer> ints2 = List.of(123, 45, 453, 22); // Java 11


        List<Integer> unmodifiableList = Collections.unmodifiableList(integers);

//        if (integers != null && !integers.isEmpty()) {
//
//        }
//
//        List<Boolean> booleans  = new ArrayList<>();
//
//        Boolean aBoolean1 = booleans.get(0);
//
//        for (Boolean aBoolean : booleans) {   // при пустом списке не заходим в цикл!
//            System.out.println(aBoolean);
//        }

//        process(ints);
//        process(strings);

        Set<String> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }

        set.add("String");
        set.add("777");
        set.add("world!");
        set.add("Hello");

        Set.of();

//        System.out.println(set);
//
//        Set<Object> uniques = new TreeSet<>(integers);
//        System.out.println(uniques);

        long start = currentTimeMillis();

        //   key      value
        Map<String, Integer> map = new HashMap<>();

        map.put("John", 41343);
        map.put("Alice", 389343);
        map.put("Katie", 389343);
        map.put("Bob", 671343);
        map.put("Mike", 389343);
//        map.put("Mike", 777);

//        System.out.println(map);

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

//        Integer integer = map.get("Bob");
//        System.out.println(integer);
//
//        Integer integer2 = map.get("Alex");
//        System.out.println(integer2);
//
//        System.out.println(map.containsKey("Alice"));
//
//
//        Integer number = map.getOrDefault("Ivan", 11230);
//        System.out.println(number);

        Set<String> keysByValue = getKeysByValue(map, 389343);

        System.out.println(keysByValue);



        long end = currentTimeMillis();

        System.out.println(start);
        System.out.println(end);
    }


    public static void print(Parent parent) {
        //logic
    }

    public static void print(List<? extends Parent> people) {
        //logic
    }

    public static void printSome(List<? super Child> people) {
        //logic
    }

    public static <T> void process(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public static Set<String> getKeysByValue(Map<String, Integer> map, Integer value) {
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer pairValue = pair.getValue();

            if (pairValue.equals(value)) {
                result.add(key);
            }
        }

        return result;
    }
}
