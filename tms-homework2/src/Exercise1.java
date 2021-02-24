public class Exercise1 {
    public static void main(String[] args) {
        double distance = 10;
        int numberOfDays = 7;

        for (int i = 1; i < numberOfDays; i++) {
            distance += distance * 1.1;
        }
        System.out.println("Cуммарный путь равный " + (int)distance + "км пробежит спортсмен за " + numberOfDays + " дней");
    }
}
