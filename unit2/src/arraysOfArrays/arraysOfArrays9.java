package arraysOfArrays;
public class arraysOfArrays9 {
    /*9. Задана матрица неотрицательных чисел.
     Посчитать сумму элементов в каждом столбце.
      Определить, какой столбец содержит максимальную сумму. */
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int countZeroColumn = 0;
        int countOneColumn = 0;
        int countTwoColumn = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]= (int) (Math.random()*10);
                if(j == 0){
                    countZeroColumn += a[i][j];
                } else if(j == 1){
                    countOneColumn += a[i][j];
                } else if(j == 2){
                    countTwoColumn += a[i][j];
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int max = Math.max(countOneColumn, countTwoColumn);
        int max1 = Math.max(max, countZeroColumn);
        //Определить, какой столбец содержит максимальную сумму
        System.out.println(countZeroColumn + " " + countOneColumn + " " + countTwoColumn);
    }
}
