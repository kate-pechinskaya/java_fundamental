import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Даны 2 числа, определить числа входящие в их.
public class cycleProgram8 {
    public  static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String a = reader.readLine();
    String b = reader.readLine();
    int a_1 =  Integer.parseInt(a);
    int b_1 = Integer.parseInt(b);
    String countA = " ";
    String countB = " ";
    for(int i = 1; i <= a.length(); i++ ) {

    }
        System.out.println(a + " :"  + countA );
        for(int i = 1; i <= b.length(); i++ ) {
            for (int j = 0; j <= 9; j++) {
                if (j == (b_1 % Math.pow(10, i) )) {
                    countB += j;
                }
            }
        }
        System.out.println(b + " :"  + countB );
    }
}


