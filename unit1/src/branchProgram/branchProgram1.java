package branchProgram;
public class branchProgram1 {
    public  static void main(String[] args) {
        int triangle1_a = 90;
        int triangle1_b = 60;
        int triangle1_c = 30;
        int triangle2_a = 35;
        int triangle2_b = 34;
        int triangle2_c = 124;
        if((triangle1_a + triangle1_b + triangle1_c) != 180)
        System.out.println("Треугольник 1 не существует");
        else if(triangle1_a == 90 || triangle1_b == 90 || triangle1_c == 90)
        System.out.println("треугольник 1 прямоугольный");
        else System.out.println("треугольник 1 существует, но не прямоугольный");

        if((triangle2_a + triangle2_b + triangle2_c) != 180)
            System.out.println("Треугольник 2 не существует");
        else if(triangle2_a == 90 || triangle2_b == 90 || triangle2_c == 90)
            System.out.println("треугольник 2 прямоугольный");
        else System.out.println("треугольник 2 существует, но не прямоугольный");
    }
}
