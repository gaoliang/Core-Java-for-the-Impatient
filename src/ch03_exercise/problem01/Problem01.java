package ch03_exercise.problem01;


import java.util.Random;

public class Problem01 {
    private static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum / objects.length;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[100];
        for (int i = 0; i < 100; i++) {
            employees[i] = new Employee();
        }
        System.out.println(average(employees));
    }
}

