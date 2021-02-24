import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        boolean isIncreasing = true;
        int countDifferent = 0;

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(myArray) + " - Исходный массив");

        for (int i = 0; i < myArray.length-1; i++) {
            if (myArray[i] > myArray[i+1]){
                isIncreasing = false;
            }
            if (myArray[i] == myArray[i+1]){
                countDifferent++;
            }
        }

        if (isIncreasing && (countDifferent != myArray.length-1)){
            System.out.println("Массив является строго возрастающей последовательностью");
        }else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
