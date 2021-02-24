import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int myArray[];
        int arrayLength;
        int newArray[];
        int i_NewArray = 0;
        int firstMaxElement;
        int secondMaxElement;
        int count = 0;


        System.out.println("Введи длинну массива");
        Scanner scanner = new Scanner(System.in);
        arrayLength = scanner.nextInt();
        myArray = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(3);
        }
        System.out.println(Arrays.toString(myArray) + " - Исходный массив");



        firstMaxElement = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > firstMaxElement){
                firstMaxElement = myArray[i];
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == firstMaxElement){
                count++;
            }
        }
        System.out.println("Первое наибольшее число в массиве = " + firstMaxElement);


        if (count != myArray.length) {
            newArray = new int[myArray.length - count];
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] != firstMaxElement) {
                    newArray[i_NewArray] = myArray[i];
                    i_NewArray++;
                }
            }

            secondMaxElement = newArray[0];
            for (int i = 1; i < newArray.length; i++) {
                if (newArray[i] > secondMaxElement) {
                    secondMaxElement = newArray[i];
                }
            }

            System.out.println("Второе наибольшее число в массиве = " + secondMaxElement);
        }else {
            System.out.println("Есть только одно наибольшее число в массиве");
        }
    }
}
