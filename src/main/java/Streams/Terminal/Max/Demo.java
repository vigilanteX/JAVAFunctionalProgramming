package Streams.Terminal.Max;

import java.util.Arrays;
import java.util.List;

public class Demo
{
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(11, 2, 3, 4,1, 5, 6, 7, 8, 9, 10);
        long c= ls.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(c);
    }
}
