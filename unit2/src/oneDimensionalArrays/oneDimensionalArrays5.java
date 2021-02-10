package oneDimensionalArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class oneDimensionalArrays5 {
    /* 5.	Даны целые числа а1 ,а2 ,..., аn .
     Вывести на печать только те числа, для которых аi > i. */
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        //заполнние массива
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30));
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < i)
                list.remove(i);
        }
        array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));
        }


}
