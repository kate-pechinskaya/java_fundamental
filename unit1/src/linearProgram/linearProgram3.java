package linearProgram;

public class linearProgram3 {
    public  static void main(String[] args) {
        double x = 3;
        double y = 4;
        System.out.println((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y));
    }
}
