public class Model {
    public double oblicz(double x, double y, String operacja) {
        switch (operacja) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                if (y != 0)
                    return x / y;
                else
                    throw new ArithmeticException("Nie można dzielić przez zero!");
            default:
                throw new IllegalArgumentException("Nieprawidłowa operacja");
        }
    }
}
