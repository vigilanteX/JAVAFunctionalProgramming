package Streams.Terminal.Count;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long ct= ls.stream().filter(x->x%2==0).count();
        System.out.println(ct);
    }
}
