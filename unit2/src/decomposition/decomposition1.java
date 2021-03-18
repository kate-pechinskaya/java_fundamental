package decomposition;

public class decomposition1 {
    /*1.	Написать метод(методы) для нахождения наибольшего общего делителя
     и наименьшего общего кратного двух натуральных чисел:
      НОК(А,В) = (А*В)/НОД(А,В)*/
    public static int a = 12;
    public static int b = 9;

    public static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        return (a + b);
    }

    public static void main(String[] args) {
        System.out.println("НОД(А,В): " + nod(a, b));
        System.out.println("НОК(А,В): " + ((a * b) / nod(a, b)));
    }
}
