package ch03.p2_StaticAndDefault;

interface Person {
    String getName();

    default int getId() {
        return 0;
    }
}

interface Identified {
    default int getId() {
        return Math.abs(hashCode());
    }
}

public class Contrast {
    public static void main(String[] args) {
    }
}