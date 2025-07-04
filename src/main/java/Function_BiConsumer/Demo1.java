package Function_BiConsumer;

import java.util.function.BiConsumer;

public class Demo1 {
    public static void main(String[] args) {
        BiConsumer<String, String> fn = (x, y) -> System.out.println(x + " " + y);
        fn.accept("Aman","Dixit");
    }
}
