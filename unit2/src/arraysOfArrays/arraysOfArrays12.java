package arraysOfArrays;

import java.util.Arrays;

public class arraysOfArrays12 {
    /*12.	Отсортировать строки матрицы по возрастанию
     и убыванию значений элементов. */
    public static int[][] matrix(){
        int[][] a= new int[][]{{2, 3, 1},{5,-1,4},{3,4,-1}};
        return a;
    }
    public static int[][] descending(){//по убыванию
        int[][] descending = matrix();
        int temp;
        for (int i = 0; i < 3; i++)
        {
            for (int j = i; j < 3; j++) {
                if (descending[i][j] > descending[i][j+1]) {
                    temp = descending[i][j];
                    descending[i][j] = descending[i][j+1];
                    descending[1][j+1] = temp;
                }
                System.out.print(descending[i][j] + "  ");
            }
            System.out.println();
        }
        return descending;
    }
    public static int[][] ascending(){//по возрастанию
        int[][] ascending = matrix();
        int temp;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                if (ascending[i][j] < ascending[i][j+1]) {
                    temp = ascending[i][j];
                    ascending[i][j] = ascending[i][j+1];
                    ascending[1][j+1] = temp;
                }
                System.out.print(ascending[i][j] + "  ");
            }
            System.out.println();
        }
        return ascending;
    }
    public static void main(String[] args) {

        System.out.println("Исходная матрица"+Arrays.deepToString(matrix()));
        System.out.println("по убыванию"+descending());
        System.out.println("по возрастанию"+ascending());
    }
}
