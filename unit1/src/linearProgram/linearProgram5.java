public class linearProgram5 {
    public  static void main(String[] args) {
        int t = 12345; //в сек
        int hour = t / 3600;
        int minute = (t % 3600) / 60;
        int second = (t % 3600) % 60;
        System.out.println(hour + "ч " + minute + "мин " + second + "с.");
    }
}
