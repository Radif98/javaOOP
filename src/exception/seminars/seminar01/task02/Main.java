package exception.seminars.seminar01.task02;

public class Main {
    public static void main(String[] args)
    {
        int[][] array = {{1, 0, 2},
                {1, 0, 1},
                {1, 0, 1}};
        System.out.println(summary(array));
    }

    static Integer summary(int[][] list) {
        int summary = 0;
        if(list.length != list[0].length) {
            throw new RuntimeException("Двумерный массив не квадратный");
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                summary += list[i][j];
                if (list[i][j] != 0 && list[i][j] != 1) {
                    throw new RuntimeException("В двумерном массиве присутствуют элементы отличные от 0 и 1");
                }
            }
        }
        return summary;
    }
}
