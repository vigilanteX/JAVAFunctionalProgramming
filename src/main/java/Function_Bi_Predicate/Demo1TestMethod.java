package Function_Bi_Predicate;

import java.util.function.BiPredicate;

public class Demo1TestMethod {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> testfn =
                (a, b) -> a + b > 18;

        System.out.println(testfn.test(10, 9));
        System.out.println(testfn.test(10, 7));

    }
}
