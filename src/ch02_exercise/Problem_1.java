package ch02_exercise;

import java.time.LocalDate;
import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input year");
        int year = in.nextInt();

        System.out.println("input month");
        int month = in.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println("");
        int day = date.getDayOfWeek().getValue();
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < day; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {

            if (date.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
        }
    }
}
