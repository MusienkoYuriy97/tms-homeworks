package additional;

public class Exercise4 {
    public static void main(String[] args) {
        int hayMoverN = 3;
        int howHour = 1;
        int result;

        if (hayMoverN <= 1){
            System.out.println("Вся бригада проработала " + howHour + " час");
        }else {
            result = hayMoverN * (howHour* 60 + 10);
            System.out.println("Вся бригада проработала " + result/60 + " ч. " + result % 60 + " мин.");
        }
    }
}
