package org.example.AnonymousClassNLambda.ImperativeProgramming;

import java.util.function.Function;

public class Demo1AnonymousClass {
    public static void main(String[] args) {
        Function<String, Integer> f1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        //System.out.println(f1.apply("Aman"));
        Function<Integer, Integer> f2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                if (integer == 0)
                    return 1;
                return integer * apply(integer - 1);
            }
        };
        System.out.println(f2.apply(5));

    }
}
