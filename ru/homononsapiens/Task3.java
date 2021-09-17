package ru.homononsapiens;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        array[0] ^= array[array.length - 1];
        array[array.length - 1] ^= array[0];
        array[0] ^= array[array.length - 1];

        System.out.println(array[0] + array[array.length / 2]);
    }
}
