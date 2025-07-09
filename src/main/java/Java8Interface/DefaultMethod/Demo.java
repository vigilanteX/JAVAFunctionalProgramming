package Java8Interface.DefaultMethod;

/**
 * Till 1.7:Every method present inside interface is always: public and abstract
 * void m1();
 * public void m1();
 * abstract void m1();
 * public abstract void m1();
 * <p>
 * In 1.8 default and static methods were allowed
 * In 1.9 private methods were allowed
 * <p>
 * Variables inside interface is public static final
 **/

interface IEmployee {
    void m1();

    void m2();

    default void m3()
    {
        System.out.println("m3 default");
    }
}

class EM implements IEmployee
{

    @Override
    public void m1() {
        System.out.println("m1 of EM");
    }

    @Override
    public void m2() {
        System.out.println("m2 of EM");
    }
}

class EM2 implements IEmployee
{

    @Override
    public void m1() {
        System.out.println("m1 of EM2");
    }

    @Override
    public void m2() {
        System.out.println("m2 of EM2");
    }

    @Override
    public void m3() {
        System.out.println("m3 overided");
    }
}

public class Demo
{
    public static void main(String[] args) {
        IEmployee employee=new EM();
        employee.m1();
        employee.m2();

        IEmployee employee2=new EM2();
        employee2.m1();
        employee2.m2();
        employee2.m3();
    }

}
