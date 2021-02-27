package additional;

public class Exercise6 {
    public static void main(String[] args) {
        int m = 230;
        int k = 54;
        int count = 0;
        
        while (m > k){
           m -= k;
           count++;
        }
        System.out.println( "Петя съел мороженое в кол-ве = " + count + "шт. и осталось ещё " + m + " рублей.");
    }
}
