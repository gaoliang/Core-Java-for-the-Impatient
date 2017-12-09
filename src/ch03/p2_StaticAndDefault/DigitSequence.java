package ch03.p2_StaticAndDefault;

public class DigitSequence implements IntSequence {
    /**
     * 将一个正整数从个位到高位依次输出
     */
    private int number;

    @Override
    public boolean hasNext() {
        return number != 0;
    }

    public DigitSequence(int number) {
        this.number = number;
    }


    @Override
    public int next() {
        int result = number % 10;
        number = number / 10;
        return result;
    }

    public int rest() {
        return number;
    }
}
