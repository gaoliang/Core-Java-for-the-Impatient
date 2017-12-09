package ch03_exercise.problem01;


import java.util.Random;

public class Employee implements Measurable {

    @Override
    public double getMeasure() {
        return new Random().nextDouble();
    }
}
