package FunctionalInterface_Supplier;

import java.util.function.Supplier;

class Configuration {
    private String url;
    private int port;
    private int timeout;

    @Override
    public String toString() {
        return "Configuration{" +
                "url='" + url + '\'' +
                ", port=" + port +
                ", timeout=" + timeout +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public int getPort() {
        return port;
    }


    public int getTimeout() {
        return timeout;
    }

    public Configuration(String url, int port, int timeout) {
        this.url = url;
        this.port = port;
        this.timeout = timeout;
    }
}


public class Demo2RealWorldExample {
    public static void main(String[] args) {
        Supplier<Configuration> supplier = () -> new Configuration("http://gw.wpac.com", 8080, 15000);
        System.out.println(supplier.get());


    }
}
