package branchProgram;
public class branchProgram3 {
    public  static void main(String[] args) {
    int x1 = 1;
    int y1 = 2;
    int x2 = 3;
    int y2 = 4;
    int x3 = 1;
    int y3 = 3;
    if(((x3 - x1) / (x2 - x1)) == ((y3-y1) / (y2 - y1)))
        System.out.println("точки лежат на одной прямой");
    else System.out.println("точки не лежат на одной прямой");
    }
}
