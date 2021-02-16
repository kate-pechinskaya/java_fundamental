package arraysOfArrays;
public class arraysOfArrays1 {
    /*1.	Дана матрица. Вывести на экран все нечетные столбцы,
     у которых первый элемент больше последнего. */
    public static void main(String[] args) {
        int[][] matrix= new int[3][3];
        matrix[0][0] = 4;
        matrix[0][1] = -2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 7;
        matrix[1][2] = 3;
        matrix[2][0] = 5;
        matrix[2][1] = 0;
        matrix[2][2] = 2;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                    if(matrix[i][0]>matrix[i][2] && (j %2!=0 || j==0))
                    System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
