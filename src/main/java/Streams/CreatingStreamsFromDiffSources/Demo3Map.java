package Streams.CreatingStreamsFromDiffSources;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Demo3Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Aman", "A");
        map.put("Adarsh", "B");
        map.put("Aditya", "C");
        map.put("Aditi", "D");
        Stream<String> keysetstream = map.keySet().stream();
        keysetstream.forEach(x -> System.out.println(x));

        Stream<String> valueset = map.values().stream();
        valueset.forEach(x -> System.out.println(x));

        Set<Map.Entry<String, String>> eSetStream = map.entrySet();
        Stream<Map.Entry<String, String>> ss = eSetStream.stream();
        ss.forEach((x) -> System.out.println(x.getKey() + " " + x.getValue()));

    }
}
