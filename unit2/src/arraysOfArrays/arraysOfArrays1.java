package arraysOfArrays;
public class arraysOfArrays1 {
    /*1.	Дана матрица. Вывести на экран все нечетные столбцы,
     у которых первый элемент больше последнего. */
    public static void main(String[] args) {
        int[][] matrix= new int[3][5];
        matrix[0][0] = 3;
        matrix[0][1] = -2;
        matrix[0][2] = 3;
        matrix[0][3] = 3;
        matrix[0][4] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 7;
        matrix[1][2] = 3;
        matrix[1][3] = 4;
        matrix[1][4] = 7;

        matrix[2][0] = 5;
        matrix[2][1] = 0;
        matrix[2][2] = 2;
        matrix[2][3] = 3;
        matrix[2][4] = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if((j) % 2 == 0 && (matrix[0][j]>matrix[2][j]))  {
                    System.out.print(matrix[i][j] + " ");

                }
            }
            System.out.println();
        }
    }
}
