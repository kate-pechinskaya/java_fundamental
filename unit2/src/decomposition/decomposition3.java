package decomposition;

public class decomposition3 {
    /*3.	Вычислить площадь правильного шестиугольника со стороной а,
     используя метод вычисления площади треугольника. */
    public static double square(int a) {
        double square;
        square = Math.sqrt(3) * 3 * Math.pow(a, 2) / 2;
        return square;
    }

    public static void main(String[] args) {
        System.out.println(square(6));
    }
}
