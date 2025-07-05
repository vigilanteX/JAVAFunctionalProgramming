package Function_Primitive;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class Demo4SupplierPrimitive
{
    public static void main(String[] args) {
        IntSupplier fn=()->2+1;
        System.out.println(fn.getAsInt());

        LongSupplier fn2=()->2222222222222222L+11111111111L;
        System.out.println(fn2.getAsLong());

        DoubleSupplier fn3=()->2222222222222222.111F+11111111111L;
        System.out.println(fn3.getAsDouble());



    }
}
