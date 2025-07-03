package Function_Bi_Predicate;

import java.util.function.BiPredicate;

public class Demo2AndMethod {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> testfn1 =
                (a, b) -> a + b > 18;
        BiPredicate<Integer, Integer> testfn2 =
                (a, b) -> (a + b) % 2 == 0;


//        System.out.println(testfn1.test(10, 6));
//        System.out.println(testfn2.test(10, 10));

        BiPredicate<Integer, Integer> testfn3 = testfn1.and(testfn2);
        System.out.println(testfn3.test(10, 9));

    }
}
