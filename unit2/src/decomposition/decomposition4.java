package decomposition;

public class decomposition4 {
    /*4.	На плоскости заданы своими координатами n точек.
     Написать метод(методы), определяющие, между какими из пар
      точек самое большое расстояние.
     Указание. Координаты точек занести в массив. */
    public static int[] coordinates(int a, int b) {
        int[] array = new int[2];
        array[0] = a;
        array[1] = b;
        return array;
    }

    public static double distance() {
        int[] arrayA = coordinates(1, 5);
        int[] arrayB = coordinates(1, 0);
        int[] arrayC = coordinates(3, -1);
        int[] arrayD = coordinates(1, 5);
        double maxDistance = 0;
        double distanceAB = Math.sqrt(Math.pow(arrayB[0] - arrayA[0], 2) + Math.pow(arrayB[1] - arrayA[1], 2));
        double distanceAC = Math.sqrt(Math.pow(arrayC[0] - arrayA[0], 2) + Math.pow(arrayC[1] - arrayA[1], 2));
        double distanceAD = Math.sqrt(Math.pow(arrayD[0] - arrayA[0], 2) + Math.pow(arrayD[1] - arrayA[1], 2));
        if (distanceAB == distanceAC || distanceAB == distanceAD)
            System.out.println("=====");
        else if (distanceAB > distanceAC && distanceAB > distanceAD)
            System.out.println("AB имеет наибольшее расстояние между точками: " + distanceAB);
        else if (distanceAC > distanceAB && distanceAC > distanceAD)
            System.out.println("AC имеет наибольшее расстояние между точками: " + distanceAC);
        else if (distanceAD > distanceAB && distanceAD > distanceAC)
            System.out.println("AD имеет наибольшее расстояние между точками: " + distanceAD);
        return maxDistance;
    }

    public static void main(String[] args) {
        distance();
    }
}
