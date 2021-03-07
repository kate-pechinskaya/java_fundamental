package arraysOfArrays;

import java.util.Arrays;

public class arraysOfArrays12 {
    /*12.	Отсортировать строки матрицы по возрастанию
     и убыванию значений элементов. */
    public static int[][] matrix(){
        int[][]a= new int[][]{{2, 3, 1},{5,-1,4},{3,4,-1}};
        return a;
    }
    public static int[][] descending(){//по убыванию
        int[][] descending = matrix();
        int temp;
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < descending.length - 1; j++) {

                    if (descending[i][j] < descending[i][j + 1]) {
                        temp = descending[i][j+1];
                        descending[i][j+1] = descending[i][j];
                        descending[i][j] = temp;
                    }
                    System.out.print(descending[i][j] + "  ");
                }
            System.out.println();
        }
        return descending;
    }
    public static int[][] ascending(){//по возрастанию
        int[][] ascending = matrix();

        for (int i = 0; i < ascending.length; i++) {
            for (int j = 0; j < 2; j++) {
                int temp;
                if (ascending[i][j] > ascending[i][j+1]) {
                    temp = ascending[i][j+1];
                    ascending[i][j+1] = ascending[i][j];
                    ascending[i][j] = temp;
                }
                System.out.print(ascending[i][j] + "  ");
            }
            System.out.println();
        }
        return ascending;
    }
    public static void main(String[] args) {

        System.out.println("Исходная матрица"+Arrays.deepToString(matrix()));
        System.out.println("матрица по убыванию");
        descending();
        System.out.println("матрица по возрастанию");
        ascending();
    }
}
