package Streams.CreatingStreamsFromDiffSources;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo4Array {
    public static void main(String[] args) {
        String[] arr={"aman","adarsh","aditya","aditi"};
        Stream<String> s= Arrays.stream(arr);
        s.forEach(x-> System.out.println(x));
    }
}
