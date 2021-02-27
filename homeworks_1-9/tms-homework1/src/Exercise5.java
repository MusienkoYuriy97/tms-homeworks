public class Exercise5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = -1;
        int negativeNumber = 0;
        int positiveCounter = 0;

        if (a > 0){
            positiveCounter++;
        }
        else if (a < 0) {
            negativeNumber++;
        }

        if (b > 0){
            positiveCounter++;
        }else if (b < 0) {
            negativeNumber++;
        }

        if (c > 0){
            positiveCounter++;
        }  else if (c < 0) {
            negativeNumber++;
        }

        System.out.println("We have " + positiveCounter + " positive and " + negativeNumber + " negative numbers");
    }
}
