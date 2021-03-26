package decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class decomposition12 {
    /*12.	Даны натуральные числа К и N. Написать метод(методы) формирования
     массива А, элементами которого являются числа,
     сумма цифр которых равна К и которые не большее N. */
    public static List array() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        List a = new ArrayList();
        int m = 2;
        int n = Integer.parseInt(reader.readLine());
        while (k != 1) {
            if (n >= k) {
                if (k % m == 0) {
                    k /= m;
                    a.add(m);
                } else if (m == 2) {
                    m++;
                } else {
                    m += 2;
                }
            } else if (n < k) {
                    k /= n;
                    a.add(n);
            }
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(array());
    }
}
