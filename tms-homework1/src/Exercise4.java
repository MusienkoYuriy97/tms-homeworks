public class Exercise4 {
    public static void main(String[] args) {
        int a = 1;
        int b = -2;
        int c = 3;
        int positiveCounter = 0;

        if (a > 0){
            positiveCounter++;
        }
        if (b > 0){
            positiveCounter++;
        }
        if (c > 0){
            positiveCounter++;
        }

        System.out.println("We have " + positiveCounter + " positive numbers");
    }
}
