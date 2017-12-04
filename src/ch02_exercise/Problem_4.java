//package ch02_exercise;
//
//
//import org.omg.CORBA.IntHolder;
//
//public class Problem_4 {
//    private static void swap(IntHolder a, IntHolder b) {
//        int temp = a.value;
//        a.value = b.value;
//        b.value = temp;
//    }
//
//    public static void main(String[] args) {
//        IntHolder a = new IntHolder(1);
//        IntHolder b = new IntHolder(2);
//        swap(a, b);
//        System.out.printf("%d %d \n", a.value, b.value);
//    }
//}
