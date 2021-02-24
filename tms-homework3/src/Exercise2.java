import java.util.Arrays;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        int[] myArray = new int[20];

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(myArray) + " - Исходный массив");

        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0){
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray) + " - массив после замены элементов с нечетным индексом на 0");

    }
}
