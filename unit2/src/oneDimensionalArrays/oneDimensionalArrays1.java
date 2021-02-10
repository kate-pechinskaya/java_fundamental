package oneDimensionalArrays;
public class oneDimensionalArrays1 {

    /* 1.	В массив A [N] занесены натуральные числа.
     Найти сумму тех элементов, которые кратны данному К.*/
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 2, 4, 6, 3, 32, 43, 45,23, 34,45};
        int k = 3;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % k == 0)
                sum += numbers[i];
        }
        System.out.println("Сумма элементов, кратных k: " + sum);
    }

}