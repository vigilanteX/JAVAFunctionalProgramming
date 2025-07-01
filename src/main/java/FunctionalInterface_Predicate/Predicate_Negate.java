package FunctionalInterface_Predicate;

import java.util.function.Predicate;
//Predicate-Negate means NOT of condtion result
public class Predicate_Negate {
    public static void main(String[] args) {
        Predicate<String> isLengthGr4 = (mssg) -> mssg.length() > 4;
        Predicate<String> check=isLengthGr4.negate();
        System.out.println(check.test("amann"));
    }
}
