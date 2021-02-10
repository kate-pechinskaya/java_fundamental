package branchProgram;
public class branchProgram4 {
    public  static void main(String[] args) {
        //отверстие
        int a = 6;
        int b = 7;
        //кирпич
        int x = 3;
        int y = 7;
        int z = 6;
if((a >= z && b >= x)||( a >= x && b >= z)||(a >= z && b >= y)||(a >= y && b >= z))
    System.out.println("кирпич пройдёт через в отверстие");
else System.out.println("кирпич не пройдёт в отверстие");
    }
}
