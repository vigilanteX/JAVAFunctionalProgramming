package FunctionalInterfaces;


import java.util.function.Function;

public class Demo1IFunction_AnonymousClass {
    public static void main(String[] args) {
        //Using anonymous class
        Function<String, String> fn = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s;
            }
        };
        System.out.println(fn.apply("Aman"));

        Function<String, Integer> fn2 = (mssg) -> mssg.length();
        System.out.println(fn2.apply("Aman_Dixit"));
    }
}
