package oneDimensionalArrays;
public class oneDimensionalArrays4 {
    /*4.	Даны действительные числа а1 ,а2 ,..., аn .
     Поменять местами наибольший и наименьший элементы. */
    public static void main(String[] args) {
        int[] array = new int[10];
        //заполнние массива
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30));
        }
        int minNumber = array[0];
        int maxNumber = array[0];
        int iMin = 0;
        int iMax = 0;

        //обработка массива
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxNumber) {
                maxNumber = array[i];
                iMax = i;
            }

            if(array[i] < minNumber) {
                minNumber = array[i];
                iMin = i;
            }

        }
        //проверка 1
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        System.out.println(iMax + "   " + iMin);
        System.out.println(maxNumber + "  " + minNumber);
    //перенос значений
    array[iMax] = minNumber;
    array[iMin] = maxNumber;
        // проверка 2
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

}
