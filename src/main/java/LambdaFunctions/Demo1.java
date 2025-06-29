package LambdaFunctions;


/**
 * Functional interface are those which contains single abstract method, but can
 * contain n number of static and default methods
 **/
interface Shape {
    void draw();

//    static void m1() {
//        System.out.println("m1()");
//    }
//
//    static void m2() {
//        System.out.println("m2()");
//    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("drawing square...");
    }
}

public class Demo1 {
    public static void main(String[] args) {
//        Shape rectangle=new Rectangle();
//        rectangle.draw();
//
//        Shape square=new Square();
//        square.draw();

        Shape rectangle = () -> {
            System.out.println("rectangle drawing");
        };
        rectangle.draw();

        Shape square = () -> System.out.println("drawing square");
        square.draw();



    }
}
