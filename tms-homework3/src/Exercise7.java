import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int myArray[] = new int[4];
        boolean areDifferent = true;


        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(myArray) + " - Исходный массив");


        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && i != j){
                    areDifferent = false;
                }
            }
        }


        if (areDifferent){
            System.out.println("Все элементы массива различны");
        }else {
            System.out.println("В массиве есть одинаковые элементы");
        }
    }
}
