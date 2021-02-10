package cycleProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cycleProgram1 {

    public  static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if(n > 0) {
            int count = 0;
            for (int i = 1; i < n; i++) {
                count++;
            }
            System.out.println(count);
        }
        else System.out.println("введено неверное число");
    }
}
