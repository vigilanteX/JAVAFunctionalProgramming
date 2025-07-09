package Java8Interface.StaticMethods;

//static methods can be called by impl class by INTERFACENAME.method()
interface B {
    public static void name() {
        System.out.println("B");
    }
}

public class Demo2 implements B
{
    public static void main(String[] args) {
        B.name();
    }
}
