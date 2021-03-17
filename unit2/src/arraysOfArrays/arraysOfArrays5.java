package arraysOfArrays;
public class arraysOfArrays5 {
    /*5.	Сформировать квадратную матрицу порядка
    n по заданному образцу(n - четное):

      1   1    1  ... 1  1  1
      2   2    2  ... 2  2  0
      3   3    3  ... 3  0  0
      .   .     . ... .  .  .
      .   .     . ... .  .  .
      .   .     . ... .  .  .
     n-1  n-1   0 ... 0  0  0
      n    0    0 ... 0  0  0
             */
    public static int[][] createMatrix() {
        int[][] matrix = new int[5][5];
        int n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < matrix.length) {
                    if (i == n) {
                        matrix[i][j] = n + 1;
                    }
                } else matrix[i][j] = 0;
            }
            n++;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(createMatrix());
    }
}
