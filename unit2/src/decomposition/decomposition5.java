package decomposition;

public class decomposition5 {
    /*5.	Составить программу, которая в массиве A[N] находит
     второе по величине число (вывести на печать число, которое
    меньше максимального элемента массива, но больше всех других элементов).*/
    public static int n = 20;

    public static int[] array() {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        return array;
    }

    public static int max() {
        int[] array = array();
        int nearMax = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > max)
                max = array[i];
        }
        for (int i = 0; i < n; i++) {
            if (array[i] == max)
                array[i] = 0;
            if (array[i] > nearMax)
                nearMax = array[i];
        }

        return nearMax;
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
