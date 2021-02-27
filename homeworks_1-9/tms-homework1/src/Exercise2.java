public class Exercise2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 1;

        if ( (a + b) > c && (b + c) > a && (a + c) > b){
            System.out.println("A triangle is exist");
        }else {
            System.out.println("A triangle doesn't exist");
        }
    }
}
