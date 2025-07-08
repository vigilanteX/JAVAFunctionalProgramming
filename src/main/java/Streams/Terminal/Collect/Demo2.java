package Streams.Terminal.Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
    private String name;
    private int age;

    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class Demo2 {
    public static void main(String[] args) {

        Emp e1 = new Emp("Aman", 25);
        Emp e2 = new Emp("John", 30);
        Emp e3 = new Emp("Priya", 28);
        Emp e4 = new Emp("Ravi", 35);
        Emp e5 = new Emp("Sneha", 26);
        Emp e6 = new Emp("Karan", 40);
        Emp e7 = new Emp("Meena", 22);
        List<Emp> empList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
        List<String> empNames = empList.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(empNames);
    }
}