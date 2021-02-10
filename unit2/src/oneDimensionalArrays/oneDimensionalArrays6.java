package oneDimensionalArrays;
public class oneDimensionalArrays6 {
    /*6.	Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, порядковые номера которых являются
    простыми числами. */
    public static void main(String[] args) {
        int n = 100;
        int[] array = new int[n];
        int sum = 0;
        //заполнние массива
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if(primeNumber(array[i]) == 1) {
                System.out.print(array[i] + " ");
                sum += array[i];
            }
        }
        System.out.println();
        System.out.println(2 + sum);
    }
    private static int primeNumber(int number) {
        for (int i = 2; i < number; i++) {

            if(number % i == 0) {
                return 0;
            }
            if((i == number)||(i > Math.sqrt(number))) {
                return  1;
            }
        }
        return 0;
    }
}
