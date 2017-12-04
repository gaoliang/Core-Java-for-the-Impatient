package ch03.p1_interface_IntSequence;

public interface IntSequence {
    // 接口声明， 与类的声明类似，如果为public，同样需要放在单独的文件中而且文件名需要与接口名相同
    // 接口中的方法不能包含具体的实现
    // public final int A = 1; ==> 接口中的变量只能是final的
    // 接口中的所有方法默认为公有方法
    boolean hasNext();

    int next();
}
