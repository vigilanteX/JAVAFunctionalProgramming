package FunctionalInterface_Supplier;

import java.util.function.Supplier;

public class Demo1Intro {
    public static void main(String[] args) {
        Supplier<String> stringSupplier=()->"Hello";
        System.out.println(stringSupplier.get());
    }
}
