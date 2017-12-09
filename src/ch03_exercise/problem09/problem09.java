package ch03_exercise.problem09;

public class problem09 {
    public static void runTogether(Runnable... tasks) {
        for (Runnable runnable : tasks) {
            new Thread(runnable).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }

    public static void main(String[] args) {
        Runnable[] tasks = new Runnable[100];
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            tasks[i] = () -> System.out.printf("i am %d \n", finalI);
        }
        runInOrder(tasks);
        runTogether(tasks);
    }
}
