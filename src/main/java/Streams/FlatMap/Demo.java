package Streams.FlatMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<List<Integer>> lol = Arrays.
                asList(Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5, 6),
                        Arrays.asList(7, 8, 9));

        List<Integer> lol2= lol.stream().flatMap(x->x.stream()).toList();
        System.out.println(lol2);

//        List<Integer> lol2= lol.stream().flatMap(x->x.stream()).toList();
//        System.out.println(lol2);


    }
}
