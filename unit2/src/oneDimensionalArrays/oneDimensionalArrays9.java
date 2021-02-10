package oneDimensionalArrays;
public class oneDimensionalArrays9 {
    /*9.	В массиве целых чисел с количеством элементов n
    найти наиболее часто встречающееся число.Если таких
    чисел несколько, то определить наименьшее из них.*/
    public static void main(String[] args) {
        int [] array = new int[]{4, 4, 4, 4, 4, 6, 6, 6, 6, 6, 3, 3, 3, 3, 3, 3};
        int count1 = 0;
        int count2 = 0;
        int popular1 = 0;
        int popular2 = 0;

        for (int i = 0; i < array.length; i++) {
            popular1 = array[i];//присваивается значение i-ого элемента массива
            count1 = 0; //счетчик количества одинаковых переменных (1)
            for (int j = i; j < array.length; j++) {
                if(popular1 == array[j]) count1++;
//сравниваем присвоенное значение popular1
// со всеми элементами массива, если такие
// имеются учеличиваем счетчик на 1
            }
            if(count1 > count2) {
//находим элемент с наибольшим количеством повторений
                popular2 = popular1;
                count2 = count1;
            }
            else if(count1 == count2) {
//если счетчики имеют одинаковые значения
                popular2 = Math.min(popular1, popular2);
//находим минимальное из 2-х popular и присваиваем его значение popular2
            }

        }
        System.out.println("Число " + popular2 + " встречается " + count2+" раз(а)");
    }
}
