package cycleProgram;

import java.math.BigInteger;

public class cycleProgram4 {
    public  static void main(String[] args) {
        BigInteger count = BigInteger.valueOf(1);

        for (int i = 2; i <= 200; i++) {

            count = count.multiply(BigInteger.valueOf((long) i * i));

        }
        System.out.println(count);
    }
}