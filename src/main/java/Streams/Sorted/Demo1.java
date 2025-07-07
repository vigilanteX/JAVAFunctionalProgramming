package Streams.Sorted;

import java.util.Arrays;
import java.util.List;

public class Demo1
{
    public static void main(String[] args) {
        //NATURAL ORDER

        //Sort list of integers
        List<Integer> nos= Arrays.asList(4,5,1,9,33,2);
        List<Integer> nosSorted =nos.stream().sorted().toList();
        System.out.println(nosSorted);

        //Sort list of string
        List<String> str= Arrays.asList("P","A","L","C");
        List<String> strSorted =str.stream().sorted().toList();
        System.out.println(strSorted);

    }
}
