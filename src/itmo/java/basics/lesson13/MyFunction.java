package itmo.java.basics.lesson13;

@FunctionalInterface
public interface MyFunction<T, T2, T3, T4, R> {
    R apply(T t, T2 t2, T3 t3, T4 t4);
}
