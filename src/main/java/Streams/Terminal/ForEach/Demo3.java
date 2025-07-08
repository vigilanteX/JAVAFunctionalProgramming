package Streams.Terminal.ForEach;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Information
{
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Information{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Information that = (Information) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Information(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

public class Demo3
{
    public static void main(String[] args) {
        Information info1 = new Information(101, "Alice", 25);
        Information info2 = new Information(102, "Bob", 30);
        Information info3 = new Information(101, "Charlie", 28);
        Information info4 = new Information(104, "David", 32);
        Information info5 = new Information(105, "Eve", 27);
        Information info6 = new Information(101, "Frank", 35);
        Information info7 = new Information(107, "Grace", 29);

        // Optionally store them in a list
        List<Information> infoList = Arrays.asList(info1, info2, info3, info4, info5, info6, info7);
        infoList.stream().distinct().forEach(x-> System.out.println(x));

    }
}
