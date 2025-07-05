package Function_Primitive;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class Demo3ConsumerPrimitive
{
    public static void main(String[] args) {
        IntConsumer consumer=(a)-> System.out.println(a+3);
        consumer.accept(33);
        LongConsumer consumer2=(a)-> System.out.println(a+333333333L);
        consumer2.accept(222222222L);
        DoubleConsumer consumer3=(a)-> System.out.println(a+22.33D);
        consumer3.accept(222222222222222.22D);


    }
}
