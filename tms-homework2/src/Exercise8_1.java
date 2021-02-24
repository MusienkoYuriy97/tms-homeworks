public class Exercise8_1 {
    public static void main(String[] args) {
        int length = 4;

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                System.out.print(" "+"\t");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
