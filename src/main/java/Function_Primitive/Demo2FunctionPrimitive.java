package Function_Primitive;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class Demo2FunctionPrimitive
{
    public static void main(String[] args) {
        IntFunction<String> f1=(a)->""+a;
        System.out.println(f1.apply(2));

        LongFunction<String> f2=(a)->""+a;
        System.out.println(f2.apply(22));

        DoubleFunction<String> f3=(a)->""+a;
        System.out.println(f3.apply(2222D));


    }
}
