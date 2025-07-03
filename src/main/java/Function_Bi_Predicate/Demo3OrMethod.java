package Function_Bi_Predicate;

import java.util.function.BiPredicate;

public class Demo3OrMethod {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> testfn1 =
                (a, b) -> a + b > 18;
        BiPredicate<Integer, Integer> testfn2 =
                (a, b) -> (a + b) % 2 == 0;

        BiPredicate<Integer, Integer> testfn3 =testfn1.or(testfn2);
        System.out.println(testfn3.test(10,7));
    }
}
