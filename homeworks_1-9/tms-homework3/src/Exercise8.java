import java.util.Arrays;
import java.util.Random;

public class Exercise8 {
    public static void main(String[] args) {
        int myArray[] = new int[7];
        int maxElement;
        int index_maxElement = 0;


        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(4);
        }
        System.out.println(Arrays.toString(myArray) + " - Исходный массив");


        maxElement = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxElement){
                maxElement = myArray[i];
                index_maxElement = i;
            }
        }
        myArray[index_maxElement] = myArray[0];
        myArray[0] = maxElement;
        System.out.println(Arrays.toString(myArray) + " - Массив после замены макс эл-та на эл. с 0-вым индексом");

    }
}
