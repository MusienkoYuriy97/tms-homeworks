public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("|Дюйм  | Сантиметр");

        for (int i = 0; i <= 9; i++) {
            System.out.print("|" + i + "     | " + (i * 2.54));
            System.out.println();
        }
    }
}
