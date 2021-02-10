package oneDimensionalArraysSort;
import java.util.Arrays;
public class oneDimensionalArraysSort4 {
    /*4.	Сортировка обменами. Дана последовательность чисел

a1 <= a2 <= ...<= an .Требуется переставить числа в порядке возрастания.
Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1 ,
то делается перестановка. Так продолжается до тех пор,
пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.*/
    public static void main(String[] args) {
        int [] array = new int[]{1, 2, 3, 4, 5, 12, 24, 35, 46, 57};
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

