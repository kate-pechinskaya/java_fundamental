package arraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraysOfArrays8 {
    /*8. В числовой матрице поменять местами два столбца любых столбца,
     т. е. все элементы одного столбца поставить на соответствующие
     им позиции другого, а его элементы второго переместить в первый.
      Номера столбцов вводит пользователь с клавиатуры. */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int oneColumn = Integer.parseInt(reader.readLine());
        int twoColumn = Integer.parseInt(reader.readLine());
        int[][] a = new int[5][5];
        int k;
        //матрица до смены столбцов
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j]= (int) (Math.random()*10);
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        //смена столбцов
        for (int i = 0; i < 5; i++) {
            k = a[i][oneColumn];
            for (int j = 0; j < 5; j++) {
                if(j == oneColumn) {
                    a[i][oneColumn] = a[i][twoColumn];
                    a[i][twoColumn] = k;
                }
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
