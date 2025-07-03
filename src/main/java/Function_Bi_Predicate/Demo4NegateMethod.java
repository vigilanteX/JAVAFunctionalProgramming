package Function_Bi_Predicate;

import java.util.function.BiPredicate;

public class Demo4NegateMethod {

    public static void main(String[] args) {

        BiPredicate<Integer,Integer> is18=(a,b)->a+b>18;
        BiPredicate<Integer,Integer> check=is18.negate();
        System.out.println(check.test(12,2));
    }
}
