package FunctionalInterface_Predicate;

import java.util.function.Predicate;

public class Predicate_IsEquals
{
    public static void main(String[] args) {
        Predicate<String> check=Predicate.isEqual("Aman Dixit");
        System.out.println(check.test("Aman Dixi"));
    }
}
