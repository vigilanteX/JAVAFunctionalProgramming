package FunctionalInterface_Predicate;

import java.util.function.Predicate;

public class Predicate_Or {
    public static void main(String[] args) {

        Predicate<String> fn1 = (mssg) -> mssg.startsWith("Mr");
        Predicate<String> fn2 = (mssg) -> mssg.length() > 3;

        Predicate<String> pred_or = fn1.or(fn2);
        System.out.println(pred_or.test("Mr "));


    }
}
