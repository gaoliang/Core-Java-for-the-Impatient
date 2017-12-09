package ch03_exercise.problem08;

public class Greeter implements Runnable {
    private int n;
    private String target;

    Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello," + target);
        }
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter(10, "world");
        Greeter greeter1 = new Greeter(100, "java");
        Thread thread = new Thread(greeter);
        Thread thread1 = new Thread(greeter1);
        thread.start();
        thread1.start();
    }
}
