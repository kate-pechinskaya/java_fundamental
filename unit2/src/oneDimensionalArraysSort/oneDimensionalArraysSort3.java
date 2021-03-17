package oneDimensionalArraysSort;
import java.util.Arrays;
public class oneDimensionalArraysSort3 {
    /*3.	Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an.
     Требуется переставить элементы так, чтобы они были расположены
      по убыванию. Для этого в массиве, начиная с первого,
      выбирается наибольший элемент и ставится на первое место,
       а первый - на место наибольшего. Затем, начиная со второго,
        эта процедура повторяется. Написать алгоритм сортировки выбором. */
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 6, 9, 12, 23, 45, 65, 245, 345};
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int position = i;
            for (int j = i + 1; j < array.length; j++) {
// i - номер текущего шага
                if (array[j] > max) {
                    position = j;
// position - индекс наибольшего элемента
                    max = array[j];
                }
            }
            array[position] = array[i];
            array[i] = max;
// меняем местами наибольший с array[i]
        }
        System.out.println(Arrays.toString(array));
    }
}


