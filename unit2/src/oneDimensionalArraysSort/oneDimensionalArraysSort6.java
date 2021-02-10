package oneDimensionalArraysSort;
import java.util.Arrays;
public class oneDimensionalArraysSort6 {
    /*6.	Сортировка Шелла. Дан массив n действительных чисел.
Требуется упорядочить его по возрастанию. Делается это следующим образом:
сравниваются два соседних элемента ai и ai+1 . Если ai<=ai+1 ,
то продвигаются на один элемент вперед. Если ai>ai+1 , то производится
перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.*/
    public static void main(String[] args) {
        int[] array = new int[]{4, 1, 6, 2, 8, 4, 9, 5, 0, 4, 7, 8};
        System.out.println(Arrays.toString(array));
// Высчитываем промежуток между проверяемыми элементами
        int gap = array.length / 2;
// Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
//смещаем правый элемент пока не найдем элемент,
//разницам между которыми не будет нужного размера
                for (int i = right - gap; i >= 0; i -= gap) {
                    if (array[i] > array[i + gap]) {
                        int tcp = array[i];
                        array[i] = array[i + gap];
                        array[i + gap] = tcp;
                    }
                }
            }
        }
    }
}
