import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] myArray = {2,1,2,2};
        int index = 0;
        int x;

        //сортируем массив
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = 0; j < myArray.length-1; j++) {
                if (myArray[j] < myArray [j+1]){
                    x = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = x;
                }
            }
        }
        System.out.println(Arrays.toString(myArray) + " - Отсортированный массив");

        //Найходим индекс второго максимального элемента
        for (int i = 1; i < myArray.length; i++) {
            if(myArray[0] == myArray[i]){
                index++;
            }
        }

        //Если массив состоит только из одного числа, например [1,1,1,1], то второго макс числа не будет
        if (index != myArray.length-1) {
            System.out.println(myArray[index+1] + " - Второе максимальное число");
        }else {
            System.out.println("Нет второго максимального числа");
        }
    }
}
