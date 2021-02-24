public class Exercise1 {
    public static void main(String[] args) {
        int count = 1;
        int number = -40;
        int copyNumber = number;

        while (copyNumber / 10 != 0){
            copyNumber /= 10;
            count++;
        }

        if (number > 0){
            System.out.print(number + " - is a positive " + count + "-digit  number ");
        }else if (number < 0){
            System.out.print(number + " - is a negative " + count + "-digit  number ");
        }else {
            System.out.print("Zero is a neutral number.");
        }
    }
}
