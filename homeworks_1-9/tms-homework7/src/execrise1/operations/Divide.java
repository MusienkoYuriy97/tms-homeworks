package execrise1.operations;

public class Divide implements Operation{
    @Override
    public double calculate(double a, double b) {
        if (b == 0){
            System.out.println("На ноль делить нельзя.");
            return 0;
        }
        return a / b;
    }
}
