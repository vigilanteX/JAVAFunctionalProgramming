package Streams.Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo2
{
    public static void main(String[] args) {
        //DESC ORDER

        //Sort list of integers
        List<Integer> nos= Arrays.asList(4,5,1,9,33,2);
        List<Integer> nosSorted =nos.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(nosSorted);

        //Sort list of string
        List<String> str= Arrays.asList("P","A","L","C");
        List<String> strSorted =str.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(strSorted);
    }
}
