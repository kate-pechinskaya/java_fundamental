package cycleProgram;

public class cycleProgram2 {
    public static void main(String[] args) {
         int a = 0;
        int b = 5;
        double x;
        double y;
        double dx = 0.5;

        for (x = a; x <= b; x += dx) {
            System.out.print("x= " + x + ",");
            if (x > 2) {
                y = x;
                System.out.println("y =" + y); }
            else if (x <= 2) {
                y = -x;
                System.out.println("y =" + y); }



        }
    }
}