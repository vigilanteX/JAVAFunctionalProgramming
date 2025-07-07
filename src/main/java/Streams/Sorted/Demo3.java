package Streams.Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Customer {
    private int age;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Customer(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class AgeSorter implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        } else
            return 0;

    }
}

public class Demo3 {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(25, "Aman", "Dixit"),
                new Customer(30, "Ravi", "Sharma"),
                new Customer(22, "Neha", "Verma"),
                new Customer(28, "Karan", "Patel"),
                new Customer(35, "Pooja", "Joshi"),
                new Customer(27, "Rahul", "Mehra"),
                new Customer(31, "Sneha", "Kapoor"),
                new Customer(24, "Ankit", "Singh")
        );

        AgeSorter ageSorter = new AgeSorter();
        List<Customer> customersSorted = customers.stream().sorted(ageSorter).toList();
        System.out.println(customersSorted);
    }
}
