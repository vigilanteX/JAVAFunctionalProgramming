package Streams.Terminal.Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Aman", "Adarsh", "Aditya");
        long count= ls.stream().collect(Collectors.counting());
        System.out.println(count);
    }
}
