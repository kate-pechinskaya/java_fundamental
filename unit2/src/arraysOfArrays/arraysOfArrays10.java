package arraysOfArrays;
public class arraysOfArrays10 {
    /*10. Найти положительные элементы главной диагонали квадратной матрицы. */
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = ((int) (Math.random() * 10) - 5);
                if (i == j && a[i][j] > 0)
                    System.out.print(a[i][j] + "  ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
