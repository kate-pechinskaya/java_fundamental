public class linearProgram4 {
    public  static void main(String[] args) {
        double R = 123.456;
        double a = Math.round(R);
        double b = Math.round((R - 123) * 1000);
        System.out.println((int)b + "." + (int)a);
    }
}
