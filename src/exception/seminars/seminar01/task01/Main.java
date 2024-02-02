package exception.seminars.seminar01.task01;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        checkError(checkList(arr, 3, 7));
        checkError(checkList(arr, 7, 4));
        checkError(checkList(null, 3, 4));
        checkError(checkList(arr, 3 ,4));

    }

    static int checkList(int[] list, int size, int el) {
        if (list == null) {
            return -3;
        }
        if (list.length < size) {
            return -1;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == el) {
                return i;
            }
        }
        return -2;
    }

    static void checkError(int error) {
        switch (error) {
            case -1:
                System.out.println("длина массива меньше некоторого заданного минимума");
                break;
            case -2:
                System.out.println("искомый элемент не найден");
                break;
            case -3:
                System.out.println("вместо массива пришел null");
                break;
            default:
                System.out.println("i: " + error);
                break;
        }
    }
}
