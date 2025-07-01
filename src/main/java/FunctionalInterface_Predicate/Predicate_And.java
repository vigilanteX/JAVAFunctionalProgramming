package FunctionalInterface_Predicate;

import java.util.function.Predicate;

public class Predicate_And {
    public static void main(String[] args) {
        Predicate<String> fn1 = (mssg) -> mssg.startsWith("Mr");
        Predicate<String> fn2 = (mssg) -> mssg.length() > 2;
        Predicate<String> res = fn1.and(fn2);
        System.out.println(res.test("Mr Aman"));
    }
}
