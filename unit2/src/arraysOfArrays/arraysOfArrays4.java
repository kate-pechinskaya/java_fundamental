package arraysOfArrays;

import java.util.Arrays;

public class arraysOfArrays4 {
    /*4.	Сформировать квадратную матрицу порядка n
     по заданному образцу(n - четное).
      1   2    3  ... n     0
      n  n-1  n-2 ... 1     1
      1   2    3  ... n     2
      n  n-1  n-2 ... 1     3
      .   .     . ... .
      .   .     . ... .
      .   .     . ... .
      n  n-1  n-2 ... 1
     */

    public static int[][] matrixFilling(){
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            int count = 1;
            int count2 = matrix[0][4];
            for (int j = 0; j < 5; j++) {
                if(i%2==0 || i==0){
                matrix[i][j] = count;
                    count++;
                }
                else  if(i%2 != 0){
                    matrix[i][j] = count2;
                    count2--;
                }
            }
        }
        return matrix;
    }
    public static int[][] printMatrix(){
        int[][] matrix= matrixFilling();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
    public static void main(String[] args) {
        System.out.print(printMatrix());
    }
}
