package arraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraysOfArrays14 {
    /*14.	Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
     причем в каждом столбце число единиц равно номеру столбца. */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j >matrix.length-1)
                    matrix[i][j] = 1;
                else matrix[i][j] = 0;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
