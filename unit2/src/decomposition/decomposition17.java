package decomposition;

public class decomposition17 {
    /*17.	Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму
     его цифр и т.д. Сколько таких действий надо произвести, чтобы получился
      нуль? Для решения задачи использовать декомпозицию. */
    public static void number(int n) {
        int count = 0;
        int sum = 0;
        int[] nn  = new int[Integer.toString(n).length()];
        while (n!=0){
            for (int i = 0; i < Integer.toString(n).length(); i++) {
                for (int j = i; j >=1 ; count++) {
                    nn[count] = n%10;
                    n/=10;
                }
                sum+=nn[i];
            }
            n-=sum;
            sum = 0;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        number(123);
    }
}