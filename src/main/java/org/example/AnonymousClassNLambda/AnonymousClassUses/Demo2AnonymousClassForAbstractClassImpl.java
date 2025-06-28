package org.example.AnonymousClassNLambda.AnonymousClassUses;


abstract class Demo {
    abstract public void name();
}

public class Demo2AnonymousClassForAbstractClassImpl {
    public static void main(String[] args)
    {
        Demo demo=new Demo() {
            @Override
            public void name() {

                System.out.println("Aman");
            }
        };
        demo.name();

    }

}
