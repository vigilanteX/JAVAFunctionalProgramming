package Function_BinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Demo {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> fn1 = (a, b) -> (a + b).length();
        System.out.println(fn1.apply("Ama","n"));

        BinaryOperator<Integer> fn2 = (a, b) -> a+b;
        System.out.println(fn2.apply(1,2));
    }
}
