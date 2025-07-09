package Streams.Terminal.AnyMatch;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //ANY ELEMENTS SHOULD MATCH CONDITION
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(ls.stream().anyMatch(x -> x % 2 == 0));

        //ALL ELEMENTS SHOULD MATCH CONDITION
        List<Integer> ls2 = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println(ls2.stream().allMatch(x -> x % 2 == 0));

        //ALL ELEMENTS SHOULD NOT MATCH CONDITION
        List<Integer> ls3 = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println(ls2.stream().noneMatch(x -> x % 2 != 0));




    }
}
