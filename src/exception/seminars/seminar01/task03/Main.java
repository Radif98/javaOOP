package exception.seminars.seminar01.task03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Integer[] array = {1, 2, 3, 4};
        checkArray(array);
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(subArrays(a, b)));


    }

    static void checkArray(Integer[] arr) {
        StringBuilder error = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                error.append(i).append(" ");
            }
        }
        if (error.length() > 0) {
            throw new RuntimeException("В массиве есть ячейки со значением null: " + error.toString());
        }
    }

    static int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] arr= new int[a.length];
        if(a.length != b.length) {
            return new int[]{0};
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a[i] - b[i];
        }
        return arr;
    }
}
