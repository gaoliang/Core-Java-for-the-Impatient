package ch03.p2_StaticAndDefault;


public interface IntSequence {

    // 提供接口的默认方法，实现改接口的类可以选择重写覆盖或者继承该默认方法
    // 主要目的是便于后期对接口进行更新，如果没有默认方法，后期添加抽象方法则会导致已实现改接口的类由于没有实现方法而"编译出错"
    // 当然，编译出错，之前已经编译过的代码仍然可以继续执行。（给接口添加方法是二进制兼容的）
    default boolean hasNext() {
        return true;
    }

    int next();

    // 静态方法主要用于工厂模式
    public static IntSequence digitalsOf(int n) {
        return new DigitSequence(n);
    }
}
