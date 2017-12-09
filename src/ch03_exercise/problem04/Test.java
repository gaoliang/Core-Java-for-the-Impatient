package ch03_exercise.problem04;

public class Test {
    public static void main(String[] args) {
        IntSequence seq = IntSequence.of(1,2,3,1,2,3);
        while (seq.hasNext()){
            System.out.println(seq.next());
        }
    }
}
