package Function_Bi_Interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo2AndThen {
    public static void main(String[] args) {
        Function<Integer, Integer> fn1 = (a) -> 3 * a;
        BiFunction<Integer, Integer, Integer> fn2 = (a, b) -> a + b;

        BiFunction<Integer, Integer, Integer> fn3=fn2.andThen(fn1);
        System.out.println(fn3.apply(1,2));



    }
}
