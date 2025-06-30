package LambdaFunctions;


/**
 * New annotation introduced
 **/
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class Demo2CreatingCalculatorAppUsingLambda {

    public static void main(String[] args) {
        Calculator sum = (x, y) -> x + y;
        System.out.println(sum.calculate(1, 2));

        Calculator subtract = (x, y) -> x - y;
        System.out.println(subtract.calculate(2, 1));

        Calculator multiply = (x, y) -> x * y;
        System.out.println(multiply.calculate(2, 4));

        Calculator divide = (x, y) -> x / y;
        System.out.println(divide.calculate(8, 2));


    }
}
