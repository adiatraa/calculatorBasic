package calculatorBasic;

public class Calculator {
	public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return first / second;
    }

    public double modulo(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Modulo by zero");
        }
        return first % second;
    }
}
