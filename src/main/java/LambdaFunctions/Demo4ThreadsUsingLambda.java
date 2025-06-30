package LambdaFunctions;

class ThreadDemo implements Runnable {

    @Override
    public void run() {

        System.out.println("Thread is executed...");
    }
}


public class Demo4ThreadsUsingLambda {
    public static void main(String[] args) {
        ThreadDemo threaddemo = new ThreadDemo();
        Thread threadRunner = new Thread(threaddemo);
        threadRunner.start();


        Runnable threaddemo2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("oldie");
            }
        };
        Thread threaddRunnerByAnonymousClass = new Thread(threaddemo2);
        threaddRunnerByAnonymousClass.start();


        Runnable threaddemo3 = () -> System.out.println("Lamda called");
        Thread threadRunnerByLambda = new Thread(threaddemo3);
        threadRunnerByLambda.start();
    }

}
