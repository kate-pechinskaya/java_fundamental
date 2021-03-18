package decomposition;

public class decomposition9 {
    /*9.	Даны числа X, Y, Z, Т — длины сторон четырехугольника.
     Написать метод(методы) вычисления его площади,
     если угол между сторонами длиной X и Y— прямой. */
    public static int square(int x, int y, int z, int t) {
        int square = ((x + z) * y) / 2;
        return square;
    }

    public static void main(String[] args) {
        System.out.println(square(2, 6, 4, 3));
    }
}
