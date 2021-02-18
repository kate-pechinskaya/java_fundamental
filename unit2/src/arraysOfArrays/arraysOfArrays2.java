package arraysOfArrays;
public class arraysOfArrays2 {
    /*2.	Дана квадратная матрица.
     Вывести на экран элементы, стоящие на диагонали. */
    public static int[][] createMatrix() {
        int[][] matrix= new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = -2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 1;
        matrix[2][0] = 5;
        matrix[2][1] = 0;
        matrix[2][2] = 2;
        return matrix;
    }
    private static int[][] printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
    private static int[][] printDiagonal(int[][] matrix) {
        String s = "  ";
        for (int i = 0; i < 3; i++) { {
                System.out.print(s+ matrix[i][i] + " ");
                s += "  ";
            }
            System.out.println();
        }
        return matrix;
    }
    public static void main(String[] args) {
        printMatrix(createMatrix());
        System.out.println();
        printDiagonal(createMatrix());
    }
}
