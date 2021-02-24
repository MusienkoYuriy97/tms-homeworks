package additional;

public class Exercise3 {
    public static void main(String[] args) {
        int N = 4;
        int sum = 0;

        for (int i = 0; i <= N; i++) {
            sum += i*i;
        }
        System.out.println("Сумма квадратов чисел от 1 до " + N + " равна " + sum);
    }
}
