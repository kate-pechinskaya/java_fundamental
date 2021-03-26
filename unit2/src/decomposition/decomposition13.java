package decomposition;

import java.io.IOException;

public class decomposition13 {
    /*13.	Два простых числа называются «близнецами», если они отличаются
     друг от друга на 2 (например, 41 и 43). Найти и напечатать все пары
     «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
     Для решения задачи использовать декомпозицию. */

    public static void array(int start) {
        int k = start * 2 - start;
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = start + i;
            if (array[i] < start * 2 - 1)
                System.out.print(array[i] + "  " + (array[i] + 2));
            System.out.println();
        }
    }

    public static void main(String[] args)  {
        array(20);
    }
}
