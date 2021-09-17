package ru.homononsapiens;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.print("x = ");
        x = scanner.nextDouble();

        System.out.print("y = ");
        y = scanner.nextDouble();

        System.out.print("z = ");
        z = scanner.nextDouble();

        average = (x + y + z) / 3;
        System.out.println("СА = " + average);

        if (((int) (average / 2)) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
