package ch03_exercise.problem05;


@FunctionalInterface
public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    int next();

    static IntSequence constant(int number) {
        return () -> number;
    }
}
