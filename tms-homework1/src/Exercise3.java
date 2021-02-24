public class Exercise3 {
    public static void main(String[] args) {
        int x = 1;

        if (x > 0){
            x++;
        }else if (x < 0){
            x -= 2;
        }else {
            x = 10;
        }

        System.out.println(x + " is our final value");
    }
}
