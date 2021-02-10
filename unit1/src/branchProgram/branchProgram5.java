package branchProgram;
public class branchProgram5 {
    public  static void main(String[] args) {
        double x = 2.0;
        double result = 0;

        if (x <= 3) {
            result = (x*x) - 3 * x + 9;
        }
        else if(x > 3) {
            result = 1/((x * x * x) + 6);
        }
        System.out.println(result);
    }
}
