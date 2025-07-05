package Streams.CreatingStreamsFromDiffSources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1List {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Apple", "Banana", "Strawberry", "Mango");
        Stream<String> l2 = l.stream();
        l2.forEach(x-> System.out.println(x));
    }
}
