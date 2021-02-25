package arraysOfArrays;
public class arraysOfArrays6 {
    /*6.	Сформировать квадратную матрицу порядка
     n по заданному образцу(n - четное):
      1   1    1  ... 1  1  1
      0   1    1  ... 1  1  0
      0   0    1  ... 1  0  0
      .   .    .  ... .  .  .
      .   .    .  ... .  .  .
      .   .    .  ... .  .  .
      0   1    1  ... 1  1  0
      1   1    1  ... 1  1  1
      */
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i+j < arr.length)
                    arr[i][j] = 1;
                else arr[i][j] = 0;

            }
        }
        //вывод результата
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}