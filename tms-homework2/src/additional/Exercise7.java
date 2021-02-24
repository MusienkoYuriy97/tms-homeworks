package additional;

public class Exercise7 {
    public static void main(String[] args) {
        double m = 50_000;
        int s = 200_000;
        int year = 0;

        while (m <= s){
            m *= 1.2;
            year++;
        }
        System.out.println("Через " + year + " лет долг превысит " + s + " рублей.");

    }
}
