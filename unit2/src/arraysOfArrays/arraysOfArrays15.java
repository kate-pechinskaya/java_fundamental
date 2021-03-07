package arraysOfArrays;
public class arraysOfArrays15 {
    /*15.	Найдите наибольший элемент матрицы и
    заменить все нечетные элементы на него. */
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int max = a[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j]= (int) (Math.random()*20);
                if(a[i][j]>=max) max=a[i][j];
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("max: "+max);
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(a[i][j] %2 != 0) a[i][j]=max;
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
