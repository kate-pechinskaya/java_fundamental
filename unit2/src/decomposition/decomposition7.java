package decomposition;
public class decomposition7 {
    /*7.	Написать метод(методы) для вычисления
    суммы факториалов всех нечетных чисел от 1 до 9. */
    public static int factorial(int n){
        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static long sum() {
        long sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += factorial(i);
            System.out.println("sum: " + sum + "  i: " + i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Сумма факториалов от 1 до 9: " + sum());
    }
}
