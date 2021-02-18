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

    public static void main(String[] args) {
        print(createMatrix());
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
                System.out.println();
                if(matrix[i][0]>matrix[i][3] && j%2==0)
                    System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
