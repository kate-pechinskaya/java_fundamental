package decomposition;

import java.util.ArrayList;
import java.util.List;

public class decomposition2 {
    /*2.	Написать метод(методы) для нахождения наибольшего
     общего делителя четырех натуральных чисел. */
    public static int a = 12;
    public static int b = 16;
    public static int c = 8;
    public static int d = 20;
    public static int m = 2;

    public static List nod(int c) {
        List opm = new ArrayList();
        while ( c != 1 ){
            if ( c % m == 0 ){
                c /= m;
                opm.add(m);
            }
            else if ( m == 2 ){
                m++;
            }
            else {
                m += 2;
            }
        }
        return(opm);
    }
    public static List pom(int a, int b, int c, int d) {
        List pomA= new ArrayList(nod(a));
        List pomB= new ArrayList(nod(b));
        List pomC= new ArrayList(nod(c));
        List pomD= new ArrayList(nod(d));
        List pomAC = new ArrayList();
        pomAC.add(pomA.retainAll(pomC));
        pomA.retainAll(pomD);
        return(pomD);
    }
    public static void main(String[] args) {
//        System.out.println(nod(a));
//        System.out.println(nod(b));
          System.out.println(pom(a, b, c, d));
    }
}
