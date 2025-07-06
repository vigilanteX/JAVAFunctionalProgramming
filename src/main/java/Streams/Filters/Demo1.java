package Streams.Filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = ls.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(even);


        List<String> str = Arrays.asList("Aman","adarsh","aditya","aditi","ritwik");
        List<String> stringfiltered= str.stream().filter((x)-> x.toUpperCase().equals("Aman".toUpperCase())).toList();
        System.out.println(stringfiltered);
    }
}
