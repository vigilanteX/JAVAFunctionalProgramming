package Streams.Terminal.Min;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(11, 2, 3, 4,1, 5, 6, 7, 8, 9, 10);
        int z = ls.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(z);

    }
}
