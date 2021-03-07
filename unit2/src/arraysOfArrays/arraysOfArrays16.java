package arraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraysOfArrays16 {
    /*16.	Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат. Пример магического квадрата порядка 3:
6  1 8
7  5 3
2  9 4 */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][n];
    }
}
