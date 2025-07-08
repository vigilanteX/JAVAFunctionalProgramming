package Streams.Terminal.Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aman", "Adarsh", "Aditya");
        Stream<String> streamOfList = list.stream();
//        List<String> newList = streamOfList.map(x -> x + " Dixit").collect(Collectors.toList());
//         System.out.println(newList);
//        Set<String> newSetList = streamOfList.map(x -> x + " Dixit").collect(Collectors.toSet());
//        System.out.println(newSetList);

        Map<String, Integer> m = streamOfList.collect(Collectors.toMap(x -> x.toUpperCase(), y -> y.length()));
        System.out.println(m);
    }
}
