package LambdaFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    private int age;
    private String name;
    private int salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class Demo5ComparatorUsingLambda {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Aman", 2000);
        Employee e2 = new Employee(2, "Adarsh", 900);
        Employee e3 = new Employee(3, "Aditya", 3200);
        Employee e4 = new Employee(4, "Aditi", 1700);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        Comparator<Employee> employeeComparator_ASC = (o1, o2) -> {
            if (o1.getSalary() < o2.getSalary())
                return -1;
            else if (o1.getSalary() > o2.getSalary()) {
                return 1;
            } else
                return 0;
        };
        Comparator<Employee> employeeComparator_DESC = (o1, o2) -> {
            if (o1.getSalary() < o2.getSalary())
                return 1;
            else if (o1.getSalary() > o2.getSalary()) {
                return -1;
            } else
                return 0;
        };
        Collections.sort(employees, employeeComparator_DESC);
        System.out.println(employees);


    }
}

class EmployeeSorterAscending implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() < o2.getSalary())
            return -1;
        else if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else
            return 0;

    }
}