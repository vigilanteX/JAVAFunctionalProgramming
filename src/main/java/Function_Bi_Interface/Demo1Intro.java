package Function_Bi_Interface;

import java.util.function.BiFunction;

public class Demo1Intro
{
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction=(a,b)->a+b;
        System.out.println(biFunction.apply(1,2));
    }
}
