package ch03.p1_interface_IntSequence;

public class InterfaceTest {
    public static void main(String[] args) {
        SquareSequence squareSequence = new SquareSequence();

        // 可以将实现接口类的对象赋值给接口变量
        IntSequence intSequence = new DigitSequence(3297);

        // 可以进行强制类型转换(cast) 将父类引用的子类对象转换为子类对象
        DigitSequence digitSequence1 = (DigitSequence) intSequence;


        // System.out.println(intSequence.rest());  当为父类引用时，无法调用实际子类对象的自有方法
        System.out.println(digitSequence1.rest()); // 进行强制类型转换为子类对象之后，可以使用子类对象的自有方法

        System.out.println(average(squareSequence, 3));
        System.out.println(average(intSequence, 4));

        while (intSequence.hasNext()) { // 对父类对象调用方法时间，实际调用的是子类对象重写或实现的方法。
            System.out.println(intSequence.next());
        }
    }

    // 参数为接口对象时，可以接收实现该接口的类的对象作为参数
    private static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;


    }

}