package ch03_exercise.problem02;

public class Employee implements Measurable {

    private String name;
    private double salary;

    @Override
    public double getMeasure() {
        return this.salary;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
