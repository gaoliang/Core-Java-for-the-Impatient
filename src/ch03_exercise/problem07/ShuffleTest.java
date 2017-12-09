package ch03_exercise.problem07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShuffleTest {
    static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        boolean flag = true;
        while (flag) {
            Collections.shuffle(strings);
            flag = false;
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                    flag = true;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("bbb");
        list.add("aaa");
        list.add("ccc");
        list.add("hhh");
        luckySort(list, Comparator.naturalOrder());
        System.out.println(list);
    }
}
