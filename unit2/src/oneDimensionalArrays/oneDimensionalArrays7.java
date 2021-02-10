package oneDimensionalArrays;
public class oneDimensionalArrays7 {
    /* 7.	Даны действительные числа a1, a2 ,..., an . Найти
max( a1+a2n , a2+a2n-1... an+ an+1 ) . */
    public static void main(String[] args) {
        int[] array = new int[]{2,1,4,8,1,3,8,1,3,2,1};
        //заполнние массива
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30));
        }
        int max = array[0] + array[1];
        for(int j = 2; j < array.length; j++) {
            if(max <= array[j] + array[j+1])
                max = array[j] + array[j+1];
        }
        for (int k = 0; k < array.length; k++)
            System.out.print(array[k] + " ");
        System.out.println(max);
    }
}
