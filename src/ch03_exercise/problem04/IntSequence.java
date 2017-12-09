package ch03_exercise.problem04;

public interface IntSequence {
    boolean hasNext();

    int next();

    static IntSequence of(int... numbers) {
        return new IntSequence() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return ++count < numbers.length;
            }

            @Override
            public int next() {
                return numbers[count];
            }
        };
    }
}
