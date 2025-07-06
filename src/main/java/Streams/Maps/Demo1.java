package Streams.Maps;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> mulBy2 = ls.stream().map(x -> x * 2).toList();
      //  System.out.println(mulBy2);


        List<String> ls2 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        List<Integer> ls2Int = ls2.stream().peek(x -> System.out.println("String: " + x))
                .map(x -> Integer.parseInt(x)).peek(x -> System.out.println("Integer: " + x)).filter(x -> x % 2 == 0).peek(x -> System.out.println("Post filter: " + x)).toList();
       // System.out.println(ls2Int);


        Employee2 e1 = new Employee2("Aman", 5, 6);
        Employee2 e2 = new Employee2("Riya", 3, 5);
        Employee2 e3 = new Employee2("Karan", 8, 7);
        Employee2 e4 = new Employee2("Neha", 2, 4);
        Employee2 e5 = new Employee2("Raj", 10, 8);
        Employee2 e6 = new Employee2("Simran", 6, 6);
        Employee2 e7 = new Employee2("Tushar", 1, 3);

        List<Employee2> employees = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);

        List<String> employeesString=employees.stream().map(x->x.getName()).toList();
        System.out.println(employeesString);

    }
}
