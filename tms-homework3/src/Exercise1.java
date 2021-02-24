import java.util.Arrays;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        int countEven = 0;

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            if (myArray[i] % 2 == 0 && myArray[i] != 0){
                countEven++;
            }
        }
        System.out.println(Arrays.toString(myArray) + " - Массив из 15 случайных чисел от 0 до 99");
        System.out.println("В массиве " + countEven + " четных чисел");
    }
}
