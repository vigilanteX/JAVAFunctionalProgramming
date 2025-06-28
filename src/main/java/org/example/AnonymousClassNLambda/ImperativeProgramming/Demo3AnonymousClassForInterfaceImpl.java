package org.example.AnonymousClassNLambda.ImperativeProgramming;

interface Employee {

    public void name();

    public void age();

}

public class Demo3AnonymousClassForInterfaceImpl
{
    public static void main(String[] args) {
        Employee employee=new Employee() {
            @Override
            public void name() {
                System.out.println("Aman");
            }

            @Override
            public void age() {
                System.out.println(24);
            }
        };

        employee.age();
        employee.name();
    }
}
