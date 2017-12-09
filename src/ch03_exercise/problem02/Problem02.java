package ch03_exercise.problem02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Problem02 {
    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum / objects.length;
    }

    public static Measurable largest(Measurable[] objects) {
        Arrays.sort(objects, Comparator.comparingDouble(Measurable::getMeasure));
        return objects[objects.length - 1];
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[100];
        for (int i = 0; i < 100; i++) {
            employees[i] = new Employee(String.format("bob%d", new Random().nextInt()), new Random().nextDouble());
        }
        System.out.println(average(employees));
        System.out.println(largest(employees).getMeasure());
    }
}

