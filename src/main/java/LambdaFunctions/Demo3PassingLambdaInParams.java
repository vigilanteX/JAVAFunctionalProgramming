package LambdaFunctions;

interface Calc {
    int calcy(int x, int y);
}


public class Demo3PassingLambdaInParams {

    private static void calcyCaller(Calc calc, int x, int y) {
        System.out.println(calc.calcy(x, y));
    }


    public static void main(String[] args) {
        Calc sum = (x, y) -> x + y;
        calcyCaller(sum, 1, 2);

        Calc sub = (x, y) -> x - y;
        calcyCaller(sub, 2, 1);

        Calc mul = (x, y) -> x * y;
        calcyCaller(mul, 3, 4);

        Calc div = (x, y) -> x / y;
        calcyCaller(div, 4, 2);


        calcyCaller((x, y) -> x * y, 4, 4);


    }
}
