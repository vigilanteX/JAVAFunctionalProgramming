package FunctionalInterface_Predicate;

import java.util.function.Predicate;

public class Predicate_Test
{
    public static void main(String[] args) {
        Predicate<String> isLengthGr1=(mssg)->mssg.length()>1;
        System.out.println(isLengthGr1.test("A"));

    }
}
