package decomposition;

public class decomposition8 {
    /*8.	Задан массив D. Определить следующие суммы:
    D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех
 последовательно расположенных элементов массива с номерами от k до m.*/
    public static void sums(int k, int m) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = k; i < m; i++) {
            sum1 = array[k] + array[k + 1] + array[k + 2];
            sum2 = array[k + 2] + array[k + 3] + array[k + 4];
            sum3 = array[k + 4] + array[k + 5] + array[k + 6];
        }
        System.out.println("Сумма первых 3 элементов от k: " + sum1);
        System.out.println("Сумма вторых 3 элементов от k: " + sum2);
        System.out.println("Сумма третьих 3 элементов от k: " + sum3);
    }

    public static void main(String[] args) {
        sums(2, 10);

    }
}
