package additional;

public class Exercise5 {
    public static void main(String[] args) {
        int N = 15;
        int count = 0;

        for (int i = 0; i <= N; i++) {
            if (i%2 !=0 && i%3 !=0 && i%5 !=0){
                count++;
                System.out.println(i + " не делится на (2, 3, 5)");
            }
        }
        System.out.println("Количество чисел не делящихся на (2, 3, 5) от 0 до " + N + "(включая) = " + count);
    }
}
