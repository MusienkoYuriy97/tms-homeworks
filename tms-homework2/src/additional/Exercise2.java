package additional;

public class Exercise2 {
    public static void main(String[] args) {
        double money_S = 1000;
        int years_N = 3;

        for (int i = 0; i < years_N; i++) {
            money_S = money_S + money_S * 0.03;
        }

        System.out.println("Сумма вклада станет = " + money_S);
    }
}
