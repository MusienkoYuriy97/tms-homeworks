public class Exercise3 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        int count = 0;

        while (a != 256){
            a = 1;
            for (int i = 0; i < count; i++) {
                a *= 2;
            }
            sum += a;
            count++;
        }

        System.out.println("1+2+4+8+...+256 = " + sum);
    }
}
