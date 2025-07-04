package Function_UnaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Demo {
    public static void main(String[] args) {
        //make square of no
        Function<Integer, Integer> sqFn = (n) -> n * n;
        System.out.println(sqFn.apply(2));

        //As above we can see i/p and o/p type are same we can replace these conditions with unary operator
        UnaryOperator<Integer> sqFn2=(n)->n*n;
        System.out.println(sqFn2.apply(3));
    }
}
