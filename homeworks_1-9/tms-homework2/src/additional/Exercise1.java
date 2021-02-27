package additional;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения 10х10");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}
