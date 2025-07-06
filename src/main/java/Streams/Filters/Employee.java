package Streams.Filters;

public class Employee
{
    private String name;
    private int exp;
    private int JL;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", exp=" + exp +
                ", JL=" + JL +
                '}';
    }

    public Employee(String name, int exp, int JL) {
        this.name = name;
        this.exp = exp;
        this.JL = JL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getJL() {
        return JL;
    }

    public void setJL(int JL) {
        this.JL = JL;
    }
}
