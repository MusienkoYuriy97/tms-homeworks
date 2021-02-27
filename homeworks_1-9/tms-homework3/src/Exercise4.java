import java.util.Arrays;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        int[] myArray = new int[12];
        int maxElement;
        int i_max = 0;

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(myArray) + " - Исходный массив");

        maxElement = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] >= maxElement){
                maxElement = myArray[i];
                i_max = i;
            }
        }
        System.out.println("максимальный элемент = " + maxElement + "; индекс последнего вхождения = " + i_max);

    }
}
