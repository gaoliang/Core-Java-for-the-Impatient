package ch03_exercise.problem05;

public class Test {
    public static void main(String[] args) {
        IntSequence intSequence = IntSequence.constant(11);
        for (int i = 0; i < 100 && intSequence.hasNext(); i++) {
            System.out.println(intSequence.next());
        }
    }
}
