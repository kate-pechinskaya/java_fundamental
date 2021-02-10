package oneDimensionalArrays;
import java.util.Arrays;
public class oneDimensionalArrays10 {
    /*10.	Дан целочисленный массив с количеством элементов n.
     Сжать массив, выбросив из него каждый второй элемент
      (освободившиеся элементы заполнить нулями). Примечание.
       Дополнительный массив не использовать. */
    public static void main(String[] args) {
        int[] array = new int[]{ 2, 4, 5, 6,7 ,3, 6, 3, 5, 2};
        for (int i = 0; i < array.length; i++) {
            if(i%2 != 0 ) array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
