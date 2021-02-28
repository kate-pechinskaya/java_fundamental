package arraysOfArrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class arraysOfArrays7 {
    /*7.	Сформировать квадратную матрицу порядка N по правилу:
    и подсчитать количество положительных элементов в ней.
    A[I,J] = sin((I^2 - J^2)/N)
    */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double[][] a = new double[n][n];
        int countPositiveNumber = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                a[i][j] = Math.sin(((i * i) - (j * j)) / n);
                if (a[i][j] > 0) {
                    countPositiveNumber++;
                }
                System.out.print(a[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("число положительных элементов " + countPositiveNumber);
    }
}
