package Function_Primitive;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class Demo1PredicatePrimitive
{

    public static void main(String[] args) {
        IntPredicate fn=(a)->a>18;
        System.out.println(fn.test(20));

        LongPredicate fn2=(b)->b>19;
        System.out.println(fn2.test(12L));

        DoublePredicate fn3=(c)->c>18.22D;
        System.out.println(fn3.test(18.23D));
    }
}
