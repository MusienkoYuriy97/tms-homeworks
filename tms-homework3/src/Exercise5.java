import java.util.Arrays;
import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        int[] myArray_1 = new int[10];
        int[] myArray_2 = new int[10];
        double[] myArray_3 = new double[10];
        int countInteger = 0;


        Random random = new Random();
        for (int i = 0; i < myArray_1.length; i++) {
            myArray_1[i] = random.nextInt(10);
            myArray_2[i] = random.nextInt(10);

            if (myArray_2[i] != 0){
                myArray_3[i] = (double)myArray_1[i] / (double)myArray_2[i];
            }else {
                System.out.println("На ноль делить нельзя!");
                myArray_3[i] = 0.01;
            }

            if (myArray_2[i] != 0 && myArray_1[i] % myArray_2[i] == 0){
                countInteger++;
            }
        }

        System.out.println(Arrays.toString(myArray_1) + " - Первый массив");
        System.out.println(Arrays.toString(myArray_2) + " - Второй массив");
        System.out.println(Arrays.toString(myArray_3) + " - Третий массив");
        System.out.println("количество целых чисел в 3-м массиве = " + countInteger);
    }
}
