package oneDimensionalArrays;
public class oneDimensionalArrays3 {
    /*3.	Дан массив действительных чисел,
     размерность которого N. Подсчитать, сколько в нем отрицательных,
      положительных и нулевых элементов. */
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        //заполнение массива случайными числами в промежутке [-15; 15]
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30) - 15);
        }
        int countMinus = 0;
        int countPlus = 0;
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0)
                countMinus++;
            if(array[i] > 0)
                countPlus++;
            if(array[i] == 0)
                countZero++;
        }
        System.out.println("кол-во отрицательных элементов: " + countMinus);
        System.out.println("кол-во положительных элементов: " + countPlus);
        System.out.println("кол-во нулевых элементов: " + countZero);
    }
}
