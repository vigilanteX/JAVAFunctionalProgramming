package Function_BiConsumer;

import java.util.function.BiConsumer;

public class Demo2AndThen {
    public static void main(String[] args) {
        BiConsumer<String, String> fn1 = (x, y) -> System.out.println(x + " " + y + " in logger 1");
        BiConsumer<String, String> fn2 = (x, y) -> System.out.println(x + " " + y + " in logger 2 ");
        BiConsumer<String, String> result = fn1.andThen(fn2);
        result.accept("Aman","Dixit");

    }
}
