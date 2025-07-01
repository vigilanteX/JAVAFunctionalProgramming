package FunctionalInterfaces;

import java.util.function.Function;

public class Demo2Function_AndThen {
    public static void main(String[] args) {
        Function<String, String> fn1_toUpper = (name) -> name.toUpperCase();
        Function<String, Integer> fn2_length = (name) -> name.length();
        Function<String, Integer> fn3_And_Then = fn1_toUpper.andThen(fn2_length);
        System.out.println(fn3_And_Then.apply("aman"));
    }
}
