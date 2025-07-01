package FunctionalInterfaces;

import java.util.function.Function;

public class Demo3Function_Compose {
    public static void main(String[] args) {
        Function<String, String> fn1_trim = (mssg) -> mssg.trim();
        Function<String,String> fn2_upper=(mssg)->mssg.toUpperCase();

        Function<String,String> trim_then_upper=fn2_upper.compose(fn1_trim);
        System.out.println(trim_then_upper.apply("   aman  "));


    }
}
