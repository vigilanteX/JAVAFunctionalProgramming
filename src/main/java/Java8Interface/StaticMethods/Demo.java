package Java8Interface.StaticMethods;

//static methods can be called without impl interface directly by INTERFACENAME.method()
interface A {
    public static void name() {
        System.out.println("hi");
    }
}


public class Demo
{
    public static void main(String[] args) {
        A.name();
    }
}
