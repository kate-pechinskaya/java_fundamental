package decomposition;

public class decomposition14 {
    /*14.	Натуральное число, в записи которого n цифр, называется числом Армстронга,
     если сумма его цифр, возведенная в степень n, равна самому числу.
      Найти все числа Армстронга от 1 до k. Для решения задачи использовать
       декомпозицию. */

    public static void armstrong() {
        int pow = 0;
        int count = 0;
        int sum = 0;
        int[] number = {0, 0, 0};
        for (int i = 0; i < 1000; i++) {
            for (int j = i; j >= 1; count++) {
                number[count] = j % 10;
                j /= 10;
                pow++;
            }
            sum = (int) (Math.pow(number[0], pow) + Math.pow(number[1], pow) + Math.pow(number[2], pow));
            if (sum == i)
                System.out.println(i);
            pow = 0;
            count = 0;
        }
    }

    public static void main(String[] args) {
        armstrong();
    }
}
