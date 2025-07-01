package FunctionalInterfaces;

import java.util.function.Function;

public class Demo4Function_Identity
{
    //Returns result as it is
    public static void main(String[] args) {
        Function<String,String> fn=Function.identity();
        System.out.println(fn.apply("aman"));
    }
}
