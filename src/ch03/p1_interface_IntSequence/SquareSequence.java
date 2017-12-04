package ch03.p1_interface_IntSequence;

public class SquareSequence implements IntSequence {

    private int i;

    @Override // 重载标记
    public boolean hasNext() {
        return true;
    }

    @Override // 重载标记
    public int next() {
        i++;
        return i * i;
    }
}
