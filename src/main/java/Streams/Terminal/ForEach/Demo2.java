package Streams.Terminal.ForEach;

import java.util.Arrays;
import java.util.List;

public class Demo2
{
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,2,3,4);
        ls.stream().distinct().forEach(x-> System.out.println(x));
    }
}
