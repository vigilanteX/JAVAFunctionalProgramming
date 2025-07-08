package Streams.Skips;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Apple");
        str.add("Banana");
        str.add("Orange");
        str.add("Mango");
        str.add("Pineapple");
        str.add("Grapes");
        str.add("Watermelon");
        str.add("Strawberry");
        str.add("Papaya");
        str.add("Kiwi");

        str.stream().skip(5L).forEach(x -> System.out.println(x));

    }
}
