package oneDimensionalArraysSort;
import java.util.Arrays;
public class oneDimensionalArraysSort2 {
    /*2.	Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm .
     Образовать из них новую последовательность чисел так, чтобы она тоже
     была неубывающей. Примечание. Дополнительный массив не использовать. */
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 3, 4, 4, 4, 5, 6, 6, 7, 8, 8, 9};
        int[] b = new int[]{7, 9, 9, 10, 10, 14, 14, 15};
        for (int i = 0; i < b.length; i++) {
            a[i] = a[i] + b[i] ;
        }
        for (int i = b.length; i < a.length; i++) {
            a[i]= a[i] + b[b.length - 1];
        }
        System.out.println(Arrays.toString(a));
    }
}
