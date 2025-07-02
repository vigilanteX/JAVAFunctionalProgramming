package FunctionalInterface_Consumer;

import java.util.function.Consumer;

public class Demo
{
    public static void main(String[] args) {

        Consumer<String> GW_LOGGER=(mssg)-> System.out.println("GW "+mssg);
        Consumer<String> API_LOGGER=(mssg)-> System.out.println("API "+mssg);

        Consumer<String> logger= GW_LOGGER.andThen(API_LOGGER);
        logger.accept("Aman");
    }
}
