package Streams.Filters;

import java.util.ArrayList;
import java.util.List;

public class Demo2
{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aman", 3, 5));
        employees.add(new Employee("Neha", 6, 6));
        employees.add(new Employee("Raj", 1, 4));
        employees.add(new Employee("Priya", 8, 7));
        employees.add(new Employee("Vikram", 4, 5));
        employees.add(new Employee("Anjali", 2, 4));
        employees.add(new Employee("Suresh", 10, 8));
        employees.add(new Employee("Divya", 5, 6));
        employees.add(new Employee("Karan", 7, 7));

        List<Employee> filteredEmp=employees.stream().filter(x->x.getExp()>=3).filter(x->x.getJL()>5).toList();
        System.out.println(filteredEmp);

    }
}
