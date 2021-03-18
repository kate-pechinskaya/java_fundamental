package decomposition;
public class decomposition10 {
    /*10.	Дано натуральное число N. Написать метод(методы) для формирования
     массива, элементами которого являются цифры числа N. */
    public static int[] createArray(int n){
        int[] array = new int[n];
        for (int i = 0; i <n; i++) {
            array[i] = n;
            System.out.print(array[i]+"  ");
        }
        return array;
    }
    public static void main(String[] args) {
        createArray(12);
    }
}
