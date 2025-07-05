package Streams.CreatingStreamsFromDiffSources;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Demo2Set {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("A");
        Stream<String> streamset =s.stream();
        streamset.forEach(x-> System.out.println(x));


    }
}
