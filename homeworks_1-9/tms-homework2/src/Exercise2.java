public class Exercise2 {
    public static void main(String[] args) {
        int x = 0;
        int numberOfHours = 6;
        int sum = 1;

        for (int i = 1; i <= numberOfHours; i++) {
            if (i % 3 == 0){
                sum *= 2;
            }
        }

        System.out.println(sum + " амеб будет через " + numberOfHours + " ч.");
    }
}
