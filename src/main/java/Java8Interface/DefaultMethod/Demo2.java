package Java8Interface.DefaultMethod;

import java.util.Map;

interface A {
    default void m1() {
        System.out.println("m1 from A");
    }
}

interface B {
    default void m1() {
        System.out.println("m1 from B");
    }
}


//ERROR-Java8Interface.DefaultMethod.Demo2 inherits unrelated defaults for m1() from types Java8Interface.DefaultMethod.A and Java8Interface.DefaultMethod.B
//public class Demo2 implements A,B
//{
//
//}


//This works as we have implemented m1 in Demo
//public class Demo2 implements A, B {
//    @Override
//    public void m1() {
//        System.out.println("m1 created in main");
//    }
//
//    public static void main(String[] args) {
//        Demo2 demo2=new Demo2();
//        demo2.m1();
//    }
//}


//We achieved multiple inheritance with same name methods in both interfaces
public class Demo2 implements A,B
{
    @Override
    public void m1() {
        A.super.m1();
    }

    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
        demo2.m1();

        A a=new Demo2();
        a.m1();
    }
}