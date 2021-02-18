package arraysOfArrays;
public class arraysOfArrays3 {
    /*3.	Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

    public static void createMatrix() {
        int k = 2;
        int p = 1;
        int[][] matrix= new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = -2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 1;
        matrix[2][0] = 5;
        matrix[2][1] = 0;
        matrix[2][2] = 2;

    }
    public static int[][] printKStringAndPColumn(int k, int p, int[][] matrix){
        for (int i = 0; i < 2; i++) { //for String
            if(i == k)
                for (int j = 0; j < 2; j++) {
                    System.out.println(matrix[i][j]);    ;
                }

        }
        return matrix;
    }
    public static void main(String[] args) {

        createMatrix();

    }
}
